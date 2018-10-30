package service;

import entity.book.BookType;

public interface InputService {

    /**
     * Asks for input from keyboard with the given message. Returns string without redundant spaces on the borders.
     * If no text was introduced then returns empty string.
     *
     * @return text in string format
     */
     String inputText(String message);

    /**
     * Asks for input from keyboard with the given message. Returns int number extracted from text.
     * If no text was introduced then returns -1.
     *
     * @return number in numeric format
     */
     int inputNumber(String message);
}
