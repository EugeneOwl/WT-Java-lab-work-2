package service.impl;

import constant.MenuOption;
import service.*;

import java.util.List;

public class MenuServiceImpl implements MenuService {

    private SessionService sessionService = new SessionServiceImpl();
    private AskService askService = new AskServiceImpl();
    private MenuOptionService menuOptionService = new MenuOptionServiceImpl();
    private OutputService outputService = new OutputServiceImpl();

    @Override
    public void runMenu() throws Exception {
        int optionNumber;
        do {
            showAvailableMenu();
            optionNumber = askService.askForMenuOption();
            MenuOption option = menuOptionService.getOption(optionNumber);
            menuOptionService.processOption(option);
        } while (optionNumber != 0);
    }

    private void showAvailableMenu() {
        List<MenuOption> menuOptions = menuOptionService
                .getAvailableOptions(sessionService.getCurrentUserRole());
        outputService.outputOptionTable(menuOptions);
    }
}
