package constant;

public class Messages {
    private static final String ERROR_PREFIX = "WARNING: ";

    public static final String USERNAME_DOES_NOT_EXIST = ERROR_PREFIX + "No user with given username found.";
    public static final String PASSWORD_DOES_NOT_MATCH = ERROR_PREFIX + "Password is incorrect.";
    public static final String OPERATION_FORBIDDEN_FOR_ROLE = ERROR_PREFIX + "Not enough rights.";
}
