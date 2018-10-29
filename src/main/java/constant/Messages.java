package constant;

public class Messages {
    private static final String ERROR_PREFIX = "ERROR: ";

    public static final String USERNAME_DOES_NOT_EXIST = ERROR_PREFIX + "No user with given username found.";
    public static final String PASSWORD_DOES_NOT_MATCH = ERROR_PREFIX + "Password is incorrect.";
    public static final String OPERATION_FORBIDDEN_FOR_ROLE = ERROR_PREFIX + "Not enough rights.";
    public static final String NO_OPTION_FOUND = ERROR_PREFIX + "No option found.";
    public static final String PAGE_NUMBER_IS_TO_BIG = ERROR_PREFIX + "Page number is out of catalog limit.";
    public static final String ENTITY_NOT_FOUND = ERROR_PREFIX + "Entity not found by id.";

    public static final String LEAVE_PAGE_MODE = "(enter to leave page mode)";
    public static final String NO_BOOKS_FOUND = "No books found.";
}
