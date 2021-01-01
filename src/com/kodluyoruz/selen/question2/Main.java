package com.kodluyoruz.selen.question2;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {

        Set<Book> books =  new HashSet<>();
        books.add(new  Book("book1", "author1", 136, LocalDate.now()));
        books.add(new  Book("book4", "author2", 249, LocalDate.now()));
        books.add(new  Book("book0", "author3", 654, LocalDate.now()));
        books.add(new  Book("book3", "author0", 364, LocalDate.now()));
        books.add(new  Book("book2", "author5", 324, LocalDate.now()));

        System.out.println("Sorted by the name ");

        //books.stream().sorted().forEach(System.out::println);

        //sortedBooks.forEach(System.out::println);

        List<Book> sortedBooks = books.stream().sorted().collect(Collectors.toList());
        for (Book sortedBook : sortedBooks) {
            System.out.println(sortedBook);
        }

        System.out.println("---------------------------------------------------");

        List<Book> bookSortedByPage = books.stream().sorted(Comparator.comparing(Book::getTotalPage)).collect(Collectors.toList());
        System.out.println("Sorted by the page");

        for(Book book: bookSortedByPage){
            System.out.println(book);
        }







    }
}
