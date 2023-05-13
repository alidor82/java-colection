package org.example.finalsample;

import org.example.model.Book;

public class FinalVariable {

    private final float p = 3.1415f;
    private final Integer waterBoil = 100;

    private static  Book book = new Book("23324");
    public static void main(String[] args) {
        book = new Book("2323");

    }
}
