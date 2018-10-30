package service.impl;

import dao.BookDao;
import dao.impl.BookDaoImpl;
import entity.book.Book;
import service.BookService;
import service.RegexService;

import java.util.List;
import java.util.stream.Collectors;

import static constant.Messages.ENTITY_NOT_FOUND;

public class BookServiceImpl implements BookService {

    private BookDao bookDao = new BookDaoImpl();
    private RegexService regexService = new RegexServiceImpl();

    @Override
    public Book getById(int id) throws Exception {
        return bookDao.getAll()
                .stream()
                .filter(it -> it.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Book> getAll() throws Exception {
        return bookDao.getAll();
    }

    @Override
    public void saveAll(List<Book> books) throws Exception {
        bookDao.saveAll(books);
    }

    @Override
    public List<Book> getAllByTitlePattern(String titlePattern) throws Exception {
        return getAll()
                .stream()
                .filter(it -> titleMatch(titlePattern, it.getTitle()))
                .collect(Collectors.toList());
    }

    @Override
    public void addBook(Book book) throws Exception {
        List<Book> books = getAll();
        int newBookId = getLastIdentifier(books) + 1;
        book.setId(newBookId);
        books.add(book);
        saveAll(books);
    }

    @Override
    public void removeBook(int id) throws Exception {
        List<Book> books = getAll();
        List<Book> booksWithoutRemovedOne = books
                .stream()
                .filter(it -> it.getId() != id)
                .collect(Collectors.toList());
        if (books.size() == booksWithoutRemovedOne.size()) {
            System.out.println(ENTITY_NOT_FOUND);
            return;
        }
        saveAll(booksWithoutRemovedOne);
    }

    @Override
    public void updateBook(Book book) throws Exception {
        List<Book> books = getAll();
        int bookNumber = getBookNumberById(books, book.getId());
        if (bookNumber < 0 || bookNumber > books.size() - 1) {
            System.out.println(ENTITY_NOT_FOUND);
            return;
        }
        books.set(bookNumber, book);
        saveAll(books);
    }

    private boolean titleMatch(String titlePattern, String title) {
        return regexService.matches(titlePattern, title);
    }

    private int getLastIdentifier(List<Book> books) {
        return books
                .stream()
                .mapToInt(Book::getId)
                .max()
                .orElse(1);
    }

    private int getBookNumberById(List<Book> books, int id) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
}
