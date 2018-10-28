package entity.book;

public enum BookType {

    PAPER_BOOK("paper book"),
    DIGITAL_BOOK("e-book"),
    UNKNOWN_BOOK("unknown");

    private String label;

    BookType(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
