package constant;

import entity.user.UserRole;

import static entity.user.UserRole.ADMIN;
import static entity.user.UserRole.ANONYMOUS;
import static entity.user.UserRole.USER;

public enum MenuOption {
    LOG_IN(1, "log in", ANONYMOUS),

    SHOW_CATALOG(2, "show catalog", USER),

    ADD_BOOK(3, "add book", ADMIN);

    private int number;
    private String label;
    private UserRole userRole;

    MenuOption(int number, String label, UserRole userRole) {
        this.number = number;
        this.label = label;
        this.userRole = userRole;
    }

    public int getNumber() {
        return number;
    }

    public String getLabel() {
        return label;
    }

    public UserRole getUserRole() {
        return userRole;
    }
}