package service.impl;

import entity.book.BookType;
import service.ParseService;

import java.util.Objects;

import static entity.book.BookType.UNKNOWN_BOOK;

public class ParseServiceImpl implements ParseService {

    @Override
    public int getInt(String string) {
        try {
            return Integer.parseInt(string);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    @Override
    public BookType getBookType(String string) {
        for (BookType bookType : BookType.values()) {
            if (bookType.getLabel().equals(string)) {
                return bookType;
            }
        }
        return UNKNOWN_BOOK;
    }

    @Override
    public String getString(String string) {
        if (Objects.isNull(string)) {
            return "";
        }
        return string.trim();
    }
}
