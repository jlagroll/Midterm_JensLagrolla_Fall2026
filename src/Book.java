class Book {
    private int isbn;
    private String bookId;
    private String title;
    private String firstNameAuthor;
    private String lastNameAuthor;
    private Boolean reserve;

    Book (int isbn, String bookId, String title, String fnameAuthor, String lnameAuthor, Boolean reserve) {
        this.isbn = isbn;
        this.bookId = bookId;
        this.title = title;
        this.firstNameAuthor = fnameAuthor;
        this.lastNameAuthor = lnameAuthor;
        this.reserve = reserve;
    }

    int getIsbn() {
        return this.isbn;
    }

    String getBookId() {
        return this.bookId;
    }

    String getTitle() {
        return this.title;
    }

    String getAuthor() {
        return String.format("%s %s", firstNameAuthor, lastNameAuthor);
    }

    void setReserve(Boolean otherReserve) {
        this.reserve = otherReserve;
    }

    Boolean getReserve() {
        return this.reserve;
    }

}
