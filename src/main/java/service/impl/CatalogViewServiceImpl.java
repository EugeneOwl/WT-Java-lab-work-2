package service.impl;

import entity.book.Book;
import service.BookService;
import service.CatalogViewService;
import service.InputService;
import service.OutputService;

import java.util.List;

import static constant.Messages.LEAVE_PAGE_MODE;
import static constant.Messages.NO_BOOKS_FOUND;
import static constant.Messages.PAGE_NUMBER_IS_TO_BIG;
import static constant.Questions.ASK_FOR_PAGE_NUMBER;
import static constant.Questions.ASK_FOR_TITLE_PATTERN;
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
        while (true) {
            int pageNumber = inputService.inputNumber(ASK_FOR_PAGE_NUMBER) - 1;
            if (pageNumber < 0) {
                return;
            }
            showPageOfBooks(books, pageNumber);
            System.out.println(LEAVE_PAGE_MODE);
        }
    }

    @Override
    public void searchInCatalog() throws Exception {
        String titlePattern = inputService.inputText(ASK_FOR_TITLE_PATTERN);
        List<Book> books = bookService.getAllByTitlePattern(titlePattern);
        if (books.isEmpty()) {
            System.out.println(NO_BOOKS_FOUND);
        } else {
            outputService.outputBookTable(books);
        }
    }

    private void showPageOfBooks(List<Book> books, int pageNumber) {
        int fromIndex = calculateFromIndex(pageNumber);
        if (fromIndex >= books.size()) {
            System.out.println(PAGE_NUMBER_IS_TO_BIG);
            return;
        }

        int toIndex = calculateToIndex(fromIndex, books.size());

        List<Book> page = books.subList(fromIndex, toIndex);
        outputService.outputBookTable(page);
    }

    private int calculateFromIndex(int pageNumber) {
        return BOOKS_PER_PAGE * Math.abs(pageNumber);
    }

    private int calculateToIndex(int fromIndex, int limit) {
        int toIndex = fromIndex + BOOKS_PER_PAGE;
        if (toIndex > limit) {
            return limit;
        }
        return toIndex;
    }
}
