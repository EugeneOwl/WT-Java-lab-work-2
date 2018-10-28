package service;

public interface MenuService {

    /**
     * Outputs menu with possible options.
     */
    public void showMenu();

    /**
     * Outputs message asking for input of menu option.
     * Returns input text.
     *
     * @return input text
     */
    public String askForOption();

    /**
     * Shows up menu, asks for option input and process chosen option.
     * Repeat the cycle until the exit option is chosen.
     */
    public void runMenu();
}
