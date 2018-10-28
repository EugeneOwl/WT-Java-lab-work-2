package service;

import constant.MenuOption;
import entity.book.Book;

import java.util.List;

public interface OutputService {

    /**
     * Outputs given list of books in form of table.
     */
    public void outputBookTable(List<Book> books);

    /**
     * Outputs given list of options in form of table.
     */
    public void outputOptionTable(List<MenuOption> options);
}
