package entity.book;

public enum BookType {

    PAPER_BOOK("paper book"),
    DIGITAL_BOOK("e-book"),
    UNKNOWN_BOOK("unknown");

    private String type;

    BookType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
