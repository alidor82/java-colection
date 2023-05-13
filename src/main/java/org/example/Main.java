package org.example;

import org.example.model.Book;
import org.example.model.BookCategory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private final static List<Book> bookList = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.println("1 =>>>>>> for adding book");
            System.out.println("2 =>>>>>> for deleting book");
            System.out.println("3 =>>>>>> for show the list of books");
            System.out.println("4 =>>>>>> show list based on category");
            System.out.println("5 =>>>>>> show largest and smallest book");

            final int number = scanner.nextInt();
            if (number == 1) {

                System.out.println("Enter book isbn");
                String isbn = new Scanner(System.in).nextLine();

                System.out.println("Enter book id");
                long bookId = new Scanner(System.in).nextLong();
                System.out.println("Enter name");
                String name = new Scanner(System.in).nextLine();

                System.out.println("Enter page");
                int page = new Scanner(System.in).nextInt();

                System.out.println("Enter publishYear");
                int publishYear = new Scanner(System.in).nextInt();

                System.out.println("Enter publish");
                String publish = new Scanner(System.in).nextLine();

                BookCategory bookCategory = getBookCategoryFromUser();
                Book book = new Book(isbn, bookId, name, page, publishYear, publish, bookCategory);
                bookList.add(book);
            }
            if (number == 2) {
                System.out.println("Enter book id");
                Scanner sca = new Scanner(System.in);
                long bookId = sca.nextLong();
                int bookIndex = -1;
                for (int i = 0; i < bookList.size(); i++) {
                    if (bookList.get(i).getBookId().equals(bookId)) {
                        bookIndex = i;
                    }
                }
                bookList.remove(bookIndex);
            }
            if (number == 3) {
                System.out.println(bookList);
            }
            if (number == 4) {
                BookCategory bookCategory = getBookCategoryFromUser();
                bookList.stream().filter(book -> book.getBookCategory().equals(bookCategory)).forEach(book -> System.out.println(book));
            }
            if (number == 5) {
                int max = bookList.get(0).getPage();
                int index = 0;
                for (int i = 0; i < bookList.size(); i++) {
                    if (bookList.get(i).getPage() > max) {
                        max = bookList.get(i).getPage();
                        index = i;
                    }
                }
                System.out.println(bookList.get(index));
            }

        }
    }

    private static BookCategory getBookCategoryFromUser() {

        BookCategory bookCategory = null;
        System.out.println("Enter bookCategory");
        System.out.println("Enter (R) for Romance");
        System.out.println("Enter (F) for Financial");
        System.out.println("Enter (L) for LIVE_STYLE");
        System.out.println("Enter (H) for HISTORY");
        System.out.println("Enter (S) for SCIENCE");
        System.out.println("Enter (O) for OTHER");

        char ch = new Scanner(System.in).nextLine().charAt(0);

        if (ch == 'R') {
            bookCategory = BookCategory.ROMANCE;
        }
        if (ch == 'F') {
            bookCategory = BookCategory.FINANCIAL;
        }
        if (ch == 'L') {
            bookCategory = BookCategory.LIFE_STYLE;
        }
        if (ch == 'H') {
            bookCategory = BookCategory.HISTORY;
        }
        if (ch == 'S') {
            bookCategory = BookCategory.SCIENCE;
        }
        if (ch == 'O') {
            bookCategory = BookCategory.OTHER;
        }
        return bookCategory;
    }


}