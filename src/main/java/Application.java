import dao.BookDao;
import dao.impl.BookDaoImpl;
import entity.book.Book;

import java.util.List;

/**
 * @author e.ivanov
 * @since 28.10.2018
 */
public class Application {
    public static void main(String[] args) throws Exception {
        BookDao bookDao = new BookDaoImpl();
        List<Book> books = bookDao.getAll();
        bookDao.save(books);
    }
}
