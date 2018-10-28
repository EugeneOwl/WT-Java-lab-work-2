package service.impl;

import entity.book.BookType;
import entity.user.UserRole;
import service.ParseService;

import java.util.Arrays;
import java.util.Objects;

import static entity.book.BookType.UNKNOWN_BOOK;
import static entity.user.UserRole.ANONYMOUS;

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
        return Arrays.stream(BookType.values())
                .filter(it -> it.name().equals(string))
                .findFirst()
                .orElse(UNKNOWN_BOOK);
    }

    @Override
    public String getString(String string) {
        if (Objects.isNull(string)) {
            return "";
        }
        return string.trim();
    }

    @Override
    public UserRole getUserRole(String string) {
        return Arrays.stream(UserRole.values())
                .filter(it -> it.name().equals(string))
                .findFirst()
                .orElse(ANONYMOUS);
    }
}
