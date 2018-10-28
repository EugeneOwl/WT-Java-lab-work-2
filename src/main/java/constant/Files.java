package constant;

public class Files {
    public static final String PROJECT_PATH = System.getProperty("user.dir");
    public static final String RESOURCES_PATH = PROJECT_PATH.concat("/src/main/resources");
    public static final String USERS_FILE_PATH = RESOURCES_PATH.concat("/users.json");
    public static final String BOOKS_FILE_PATH = RESOURCES_PATH.concat("/books.json");
}
