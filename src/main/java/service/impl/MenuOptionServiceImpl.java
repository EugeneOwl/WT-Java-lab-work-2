package service.impl;

import constant.MenuOption;
import entity.user.UserRole;
import service.*;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static constant.Messages.NO_OPTION_FOUND;
import static constant.Messages.OPERATION_FORBIDDEN_FOR_ROLE;

public class MenuOptionServiceImpl implements MenuOptionService {

    private PermissionService permissionService = new PermissionServiceImpl();
    private AuthService authService = new AuthServiceImpl();
    private SessionService sessionService = new SessionServiceImpl();
    private CatalogViewService catalogViewService = new CatalogViewServiceImpl();
    private CatalogManagmentService catalogManagmentService = new CatalogManagementServiceImpl();

    @Override
    public MenuOption getOption(int number) {
        return Arrays.stream(MenuOption.values())
                .filter(it -> it.getNumber() == number)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<MenuOption> getAvailableOptions(UserRole userRole) {
        return Arrays.stream(MenuOption.values())
                .filter(it -> permissionService.haveEnoughRights(userRole, it.getUserRole()))
                .collect(Collectors.toList());
    }

    @Override
    public void processOption(MenuOption option) throws Exception {
        if (Objects.isNull(option)) {
            System.out.println(NO_OPTION_FOUND);
            return;
        }
        if (!permissionService.haveEnoughRights(sessionService.getCurrentUserRole(), option.getUserRole())) {
            System.out.println(OPERATION_FORBIDDEN_FOR_ROLE);
            return;
        }
        switch (option) {
            case LOG_IN:
                authService.authenticate();
                return;
            case SHOW_CATALOG:
                catalogViewService.showCatalog();
                return;
            case SHOW_PAGE:
                catalogViewService.showCatalogPage();
                return;
            case SEARCH_CATALOG:
                catalogViewService.searchInCatalog();
                return;
            case ADD_BOOK:
                catalogManagmentService.addBook();
                return;
            case UPDATE_BOOK:
                catalogManagmentService.updateBook();
                return;

            case LOG_OUT:
                authService.logout();
        }
    }
}
