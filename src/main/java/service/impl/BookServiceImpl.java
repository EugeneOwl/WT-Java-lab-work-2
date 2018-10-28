package service.impl;

import dao.BookDao;
import dao.impl.BookDaoImpl;
import entity.book.Book;
import service.BookService;
import service.RegexService;

import java.util.List;
import java.util.stream.Collectors;

public class BookServiceImpl implements BookService {

    private BookDao bookDao = new BookDaoImpl();
    private RegexService regexService = new RegexServiceImpl();

    @Override
    public List<Book> getAll() throws Exception {
        return bookDao.getAll();
    }

    @Override
    public void save(List<Book> books) throws Exception {

    }

    @Override
    public List<Book> getAllByTitlePattern(String titlePattern) throws Exception {
        return getAll()
                .stream()
                .filter(it -> titleMatch(titlePattern, it.getTitle()))
                .collect(Collectors.toList());
    }

    private boolean titleMatch(String titlePattern, String title) {
        return regexService.matches(titlePattern, title);
    }
}
