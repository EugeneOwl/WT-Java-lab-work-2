package service;

import entity.book.Book;

public interface CatalogManagmentService {

    /**
     * Returns book by given identifier. If no book found then returns null.
     *
     * @param id - identifier of needed book
     */
    public Book getBook(Long id);

    /**
     * Adds book to existing book catalog.
     *
     * @param book - book which will be added
     */
    public void addBook(Book book);

    /**
     * Removes book with given identifier. If no book found then nothing happens.
     *
     * @param id - identifier of needed book
     */
    public void removeBook(Long id);

    /**
     * Founds book with identifier of the given one and replaces it by the given book.
     * If no book found then nothing happens.
     *
     * @param book - book to update existing one
     */
    public void updateBook(Book book);
}
