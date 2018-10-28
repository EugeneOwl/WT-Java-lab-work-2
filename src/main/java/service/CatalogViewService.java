package service;

public interface CatalogViewService {

    /**
     * Outputs full list of existing books in form of table.
     */
     void showCatalog();

    /**
     * Outputs page with given number of existing books in form of table.
     * If page with given number does not exist then nothing happens.
     *
     * @param pageNumber - number of needed page.
     */
     void showCatalog(int pageNumber);

    /**
     * Outputs list of books with title matching book title pattern in form of table.
     *
     * @param title - book title pattern
     */
     void showCatalog(String title);
}
