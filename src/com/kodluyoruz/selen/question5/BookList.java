package com.kodluyoruz.selen.question5;

import com.kodluyoruz.selen.question2.Book;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BookList {
    public static void main(String[] args) {
        List<Book> booksList = new ArrayList<>();

        booksList.add(new Book("power", "selen", 970, LocalDate.now()));
        booksList.add(new Book("bird", "demir", 350, LocalDate.now()));
        booksList.add(new Book("water", "bakır", 80, LocalDate.now()));
        booksList.add(new Book("world", "ayşe", 230, LocalDate.now()));
        booksList.add(new Book("clock", "fatma", 340, LocalDate.now()));
        booksList.add(new Book("purple", "ali", 380, LocalDate.now()));
        booksList.add(new Book("blue", "asi", 120, LocalDate.now()));
        booksList.add(new Book("night", "beki", 40, LocalDate.now()));
        booksList.add(new Book("time", "sina", 210, LocalDate.now()));
        booksList.add(new Book("pink", "umut", 590, LocalDate.now()));

        Map<String, String> bookNameAndAuthorName  = booksList.stream().collect(Collectors.toMap(Book::getBookName, Book::getAuthorName));

        /*Map<String, String> bookNameAndAuthorName = new HashMap<>();
        booksList.stream().forEach(book -> bookNameAndAuthorName.put(book.getBookName(), book.getAuthorName()));
*/
        for(Map.Entry<String,String> entry : bookNameAndAuthorName.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println("-------------------------------------------------------------------");

        List<Book> booksPageNumberGreaterThanHundred = booksList.stream().filter(book -> book.getTotalPage() >= 100).collect(Collectors.toList());
        for(Book book : booksPageNumberGreaterThanHundred){
            System.out.println(book);
        }

    }
}
