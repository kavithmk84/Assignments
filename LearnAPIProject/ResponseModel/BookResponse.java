package ResponseModel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BookResponse {
    @JsonProperty("bookName")
    private String bookName;
    @JsonProperty("isbn")
    private String isbn;
    @JsonProperty("aisle")
    private String aisle;
    @JsonProperty("author")
    private String author;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAisle() {
        return aisle;
    }

    public void setAisle(String aisle) {
        this.aisle = aisle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }



}
