package service.impl;

import constant.MenuOption;
import entity.book.Book;
import service.OutputService;

import java.text.MessageFormat;
import java.util.List;

public class OutputServiceImpl implements OutputService {

    @Override
    public void outputBookTable(List<Book> books) {

    }

    @Override
    public void outputOptionTable(List<MenuOption> options) {
        options.forEach(this::outputOption);
    }

    private void outputOption(MenuOption option) {
        System.out.println(MessageFormat.format("{0}) {1}", option.getNumber(), option.getLabel()));
    }
}
