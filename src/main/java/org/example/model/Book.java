package org.example.model;

public class Book {
    private String isbn;
    private Long bookId;
    private String name;
    private Integer page;
    private Integer publishYear;
    private String publish;
    private BookCategory bookCategory;

    public Book(String isbn) {
        this.isbn = isbn;
    }

    public Book(String isbn, Long bookId, String name, Integer page, Integer publishYear, String publish, BookCategory bookCategory) {
        this.isbn = isbn;
        this.bookId = bookId;
        this.name = name;
        this.page = page;
        this.publishYear = publishYear;
        this.publish = publish;
        this.bookCategory = bookCategory;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(Integer publishYear) {
        this.publishYear = publishYear;
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String

                                   publish) {
        this.publish = publish;
    }

    public BookCategory getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(BookCategory bookCategory) {
        this.bookCategory = bookCategory;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", bookId=" + bookId +
                ", name='" + name + '\'' +
                ", page=" + page +
                ", publishYear=" + publishYear +
                ", publish=" + publish +
                ", bookCategory=" + bookCategory +
                '}';
    }

}
