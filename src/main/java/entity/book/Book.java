package entity.book;

public class Book {

    private int id;
    private String title;
    private BookType type;
    private String description;

    public Book() {
    }

    public Book(int id, String title, BookType type, String description) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.description = description;
    }

    public Book(String title, BookType type, String description) {
        this.title = title;
        this.type = type;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", type=" + type +
                ", description='" + description + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BookType getType() {
        return type;
    }

    public void setType(BookType type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
