package service.impl;

import entity.book.Book;
import entity.book.BookType;
import service.AskService;
import service.BookService;
import service.CatalogManagmentService;
import service.ParseService;

import static constant.Messages.ENTITY_NOT_FOUND;

public class CatalogManagementServiceImpl implements CatalogManagmentService {

    private AskService askService = new AskServiceImpl();
    private ParseService parseService = new ParseServiceImpl();
    private BookService bookService = new BookServiceImpl();

    @Override
    public void addBook() throws Exception {
        Book book = getBookFromInputParameters();
        bookService.addBook(book);
    }

    @Override
    public void removeBook() throws Exception {
        int id = askService.askForBookId();
        if (id == -1) {
            System.out.println(ENTITY_NOT_FOUND);
            return;
        }
        bookService.removeBook(id);
    }

    @Override
    public void updateBook() throws Exception {
        int id = askService.askForBookId();
        if (id == -1) {
            System.out.println(ENTITY_NOT_FOUND);
            return;
        }
        Book book = getBookFromInputParameters();
        book.setId(id);
        bookService.updateBook(book);
    }

    private Book getBookFromInputParameters() {
        String title = askService.askForBookTitle();
        BookType type = parseService.getBookType(askService.askForBookType());
        String description = askService.askForBookDescription();
        return new Book(title, type, description);
    }
}
