package service.impl;

import constant.MenuOption;
import entity.book.Book;
import service.OutputService;

import java.text.MessageFormat;
import java.util.List;

import static constant.TableOptions.CATALOG_BORDER;
import static constant.TableOptions.MENU_BORDER;

public class OutputServiceImpl implements OutputService {

    @Override
    public void outputBookTable(List<Book> books) {
        outputCatalogBorder();
        books.forEach(this::outputBookRaw);
        outputCatalogBorder();
    }

    @Override
    public void outputOptionTable(List<MenuOption> options) {
        outputMenuBorder();
        options.forEach(this::outputOptionRaw);
        outputMenuBorder();
    }

    private void outputOptionRaw(MenuOption option) {
        System.out.println(MessageFormat.format("{0}) {1}", option.getNumber(), option.getLabel()));
    }

    private void outputBookRaw(Book book) {
        System.out.println(MessageFormat.format("{0}   {1}     {2}   {3}",
                book.getId(), book.getTitle(), book.getType().getLabel(), book.getDescription()));
    }

    private void outputMenuBorder() {
        System.out.println(MENU_BORDER);
    }

    private void outputCatalogBorder() {
        System.out.println(CATALOG_BORDER);
    }
}
