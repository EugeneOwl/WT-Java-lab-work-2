package service.impl;

import entity.book.Book;
import service.BookService;
import service.CatalogViewService;
import service.InputService;
import service.OutputService;

import java.util.List;

import static constant.Messages.LEAVE_PAGE_MODE;
import static constant.Messages.PAGE_NUMBER_IS_TO_BIG;
import static constant.Questions.ASK_FOR_PAGE_NUMBER;
import static constant.TableOptions.BOOKS_PER_PAGE;

public class CatalogViewServiceImpl implements CatalogViewService {

    private BookService bookService = new BookServiceImpl();
    private OutputService outputService = new OutputServiceImpl();
    private InputService inputService = new InputServiceImpl();

    @Override
    public void showCatalog() throws Exception {
        List<Book> books = bookService.getAll();
        outputService.outputBookTable(books);
    }

    @Override
    public void showCatalogPage() throws Exception {
        List<Book> books = bookService.getAll();
        while (true){
            int pageNumber = inputService.inputNumber(ASK_FOR_PAGE_NUMBER);
            if (pageNumber == -1) {
                return;
            }
            showPageOfBooks(books, pageNumber);
            System.out.println(LEAVE_PAGE_MODE);
        }
    }

    @Override
    public void showCatalog(String title) {

    }


    private void showPageOfBooks(List<Book> books, int number) {
        int fromIndex = BOOKS_PER_PAGE * number;
        int toIndex = fromIndex + BOOKS_PER_PAGE;
        if (fromIndex > books.size()) {
            System.out.println(PAGE_NUMBER_IS_TO_BIG);
            return;
        }
        if(toIndex > books.size()) {
            toIndex = books.size();
        }
        List<Book> page = books.subList(fromIndex, toIndex);
        outputService.outputBookTable(page);
    }
}
