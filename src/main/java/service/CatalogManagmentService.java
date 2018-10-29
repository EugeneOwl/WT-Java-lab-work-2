package service;

public interface CatalogManagmentService {

    /**
     * Asks to input new book parameters and adds book to existing book catalog.
     */
     void addBook() throws Exception;

    /**
     * Asks fro book id and removes book with given identifier. If no book found then nothing happens.
     */
     void removeBook();

    /**
     * Asks for book parameters ounds book with identifier of the given one and replaces it by the given book.
     * If no book found then nothing happens.
     */
     void updateBook() throws Exception;
}
