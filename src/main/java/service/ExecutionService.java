package service;

public interface ExecutionService {

    /**
     * Asks for credentials and try to authenticate.
     * In case of correct authentication sets up current session user.
     */
    public void executeLogIn();

    /**
     * Shows the whole catalog of existing books in form of table.
     */
    public void showCatalog();

    /**
     * Asks for page number and shows page by given number in form of table.
     */
    public void showPage();

    /**
     * Asks for book name pattern and shows the books that match in form of table.
     */
    public void searchCatalog();

    /**
     * Asks for book parameters and adds book to existing catalog.
     */
    public void addBook();

    /**
     * Asks for book id. If book was found asks for new book parameters and updates found one.
     */
    public void updateBook();
}
