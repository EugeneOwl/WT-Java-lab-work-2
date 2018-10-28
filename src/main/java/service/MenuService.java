package service;

import entity.user.UserRole;

public interface MenuService {

    /**
     * Outputs menu with possible options.
     */
    public void showAvaibaleMenu(UserRole userRole);

    /**
     * Shows up menu, asks for option input and process chosen option.
     * Repeat the cycle until the exit option is chosen.
     */
    public void runMenu();
}
