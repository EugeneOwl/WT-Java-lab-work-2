package service;

import entity.book.BookType;

public interface InputService {

    /**
     * Asks for input from keyboard with the given message. Returns string without redundant spaces on the borders.
     * If no text was introduced then returns empty string.
     *
     * @return text in string format
     */
    public String inputText(String message);

    /**
     * Asks for input from keyboard with the given message. Returns int number extracted from text.
     * If no text was introduced then returns 0.
     *
     * @return number in numeric format
     */
    public int inputNumber(String message);

    /**
     * Asks for input from keyboard with the given message. Returns book type extracted from text.
     * If incorrect text was introduced then returns {@link BookType#UNKNOWN_BOOK}.
     *
     * @return number in numeric format
     */
    public BookType inputBookType(String message);
}
