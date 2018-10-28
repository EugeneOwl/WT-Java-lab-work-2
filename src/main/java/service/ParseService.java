package service;

import entity.book.BookType;
import entity.user.UserRole;

public interface ParseService {

    /**
     * Returns int numeric value from string.
     * If string does not match returns -1.
     *
     * @param string - string to parse
     * @return int numeric value from string
     */
    int getInt(String string);

    /**
     * Returns {@link BookType} value from string.
     * If string does not match returns {@link BookType#UNKNOWN_BOOK}.
     *
     * @param string - string to parse
     * @return int numeric value from string
     */
    BookType getBookType(String string);

    /**
     * Returns string without redundant spaces on borders from given string.
     * If given string is null returns empty string.
     *
     * @param string - given string
     * @return string
     */
    String getString(String string);

    /**
     * Returns {@link UserRole} value from string.
     * If string does not match returns {@link UserRole#ANONYMOUS}.
     *
     * @param string - string to parse
     * @return int numeric value from string
     */
    UserRole getUserRole(String string);
}
