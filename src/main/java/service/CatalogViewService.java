package service;

public interface CatalogViewService {

    /**
     * Outputs full list of existing books in form of table.
     */
    public void showCatalog();

    /**
     * Outputs page with given number of existing books in form of table.
     * If page with given number does not exist then nothing happens.
     *
     * @param pageNumber - number of needed page.
     */
    public void showCatalog(int pageNumber);

    /**
     * Outputs list of books with name matching book name pattern in form of table.
     *
     * @param name - book name pattern
     */
    public void showCatalog(String name);
}
