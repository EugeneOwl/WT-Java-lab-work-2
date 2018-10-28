package service.impl;

import dao.BookDao;
import dao.impl.BookDaoImpl;
import entity.book.Book;
import service.BookService;

import java.util.List;

public class BookServiceImpl implements BookService {

    private BookDao bookDao = new BookDaoImpl();

    @Override
    public List<Book> getAll() throws Exception {
        return bookDao.getAll();
    }

    @Override
    public void save(List<Book> books) throws Exception {

    }
}
