package service;

public interface MenuService {

    /**
     * Shows up menu, asks for option input and process chosen option.
     * Repeat the cycle until the exit option is chosen.
     */
     void runMenu() throws Exception;
}
