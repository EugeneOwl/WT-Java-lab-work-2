package service;

public interface ExecutionService {

    /**
     * Asks for credentials and try to authenticate.
     * In case of correct authentication sets up current session user.
     */
     void executeLogIn();

    /**
     * Shows the whole catalog of existing books in form of table.
     */
     void showCatalog();

    /**
     * Asks for page number and shows page by given number in form of table.
     */
     void showPage();

    /**
     * Asks for book name pattern and shows the books that match in form of table.
     */
     void searchCatalog();

    /**
     * Asks for book parameters and adds book to existing catalog.
     */
     void addBook();

    /**
     * Asks for book id. If book was found asks for new book parameters and updates found one.
     */
     void updateBook();
}
