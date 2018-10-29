package dao;

import entity.book.Book;

import java.util.List;

public interface BookDao {

    /**
     * Returns full list of existing books.
     *
     * @return full list of existing books
     */
    public List<Book> getAll() throws Exception;

    /**
     * Saves given list of books to repository. All existing books in repository erased.
     *
     * @param books - books to saveAll
     */
    public void saveAll(List<Book> books) throws Exception;
}
