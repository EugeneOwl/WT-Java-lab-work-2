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
     * @param books - books to save
     */
    void save(List<Book> books) throws Exception;
}
