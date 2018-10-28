package service;

public interface CatalogViewService {

    /**
     * Outputs full list of existing books in form of table.
     */
     void showCatalog() throws Exception;

    /**
     * Asks for page number and outputs page of existing books with given number in form of table.
     * If page with given number does not exist then nothing happens.
     */
     void showCatalogPage() throws Exception;

    /**
     * Asks for book title and outputs list of books with title matching book title pattern in form of table.
     */
     void searchInCatalog() throws Exception;
}
