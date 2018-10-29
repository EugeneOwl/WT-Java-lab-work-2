package service;

import entity.book.Book;

import java.util.List;

public interface BookService {

    /**
     * Returns full list of existing books.
     *
     * @return full list of existing books
     */
    List<Book> getAll() throws Exception;

    /**
     * Saves given list of books to repository. All existing books in repository erased.
     *
     * @param books - books to saveAll
     */
    void saveAll(List<Book> books) throws Exception;

    /**
     * Returns list of existing books with matching titles.
     *
     * @return list of existing books
     */
    List<Book> getAllByTitlePattern(String titlePattern) throws Exception;

    /**
     * Adds book to existing book catalog.
     *
     * @param book - book which will be added
     */
    void addBook(Book book) throws Exception;

    /**
     * Removes book with given identifier. If no book found then nothing happens.
     *
     * @param id - identifier of needed book
     */
    void removeBook(int id);

    /**
     * Founds book with identifier of the given one and replaces it by the given book.
     * If no book found then nothing happens.
     *
     * @param book - book to update existing one
     */
    void updateBook(Book book) throws Exception;
}
