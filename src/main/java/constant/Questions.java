package constant;

import static constant.ConsoleColors.ANSI_GREEN;
import static constant.ConsoleColors.ANSI_RESET;

public class Questions {

    private static final String INPUT_PREFIX = ANSI_GREEN + "Enter " + ANSI_RESET;

    public static final String ASK_FOR_MENU_OPTION = INPUT_PREFIX + "menu option:";
    public static final String ASK_FOR_USERNAME = INPUT_PREFIX + "username:";
    public static final String ASK_FOR_PASSWORD = INPUT_PREFIX + "password:";
    public static final String ASK_FOR_PAGE_NUMBER = INPUT_PREFIX + "page number:";
    public static final String ASK_FOR_TITLE_PATTERN = INPUT_PREFIX + "title to search:";
    public static final String ASK_FOR_BOOK_TITLE = INPUT_PREFIX + "book title:";
    public static final String ASK_FOR_BOOK_DESCRIPTION = INPUT_PREFIX + "book description:";
    public static final String ASK_FOR_BOOK_TYPE = INPUT_PREFIX + "book type:";
    public static final String ASK_FOR_BOOK_ID = INPUT_PREFIX + "book id:";
}
