package com.kodluyoruz.selen.question2;

import java.time.LocalDate;




public class Book implements Comparable<Book>{

    private String bookName;
    private String authorName;
    private int totalPage;
    private LocalDate publishedDate;

    public Book(String bookName, String authorName, int totalPage, LocalDate publishedDate) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.totalPage = totalPage;
        this.publishedDate = publishedDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public LocalDate getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(LocalDate publishedDate) {
        this.publishedDate = publishedDate;
    }

    @Override
    public int compareTo(Book book) {
        return this.bookName.compareTo(book.bookName) ;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", totalPage=" + totalPage +
                ", publishedDate=" + publishedDate +
                '}';
    }
}
