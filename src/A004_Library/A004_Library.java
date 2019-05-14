package A004_Library;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

/**
 * Create a class Book representing books in a library
 *
 *     Create list of possible fields, then implement a class. Discuss your design with other students.
 *     Create up to 5 books. Add some methods that are printing the book information in a nicely formatted way.
 *
 *     If you would need to check if a book is rented by a user, what properties you would like  to add to the
 *     Book class?
 *
 *     If you are creating an application for a book store (like Thalia), how would you need to expand your book class?
 *
 *     Store your books in an array. Loop through the array and print results.
 *
 *     Do some inventory in the library. Track the number of books that you have for any specific book edition
 *     (note: there are more elegant ways to solve this problem, but for now, resort to use an additional array that
 *     tracks how many “Hobit” book do you have, how many “Game of Thrones”, how many ...)
 *
 *     ADVANCED: create a method that goes through the array of Books and tells you how
 *
 *         How many books have been currently rented
 *
 *         How many books are still in the library
 *
 *         (note: you probably need to expand your property model somehow)
 */

public class A004_Library {

    public static void main(String[] args){

        Book b1 = new Book("City of Ashes", "Judith Lang-Ladurner", 463, true,
                new GregorianCalendar(2019,04,10));
        Book b2 = new Book("Chronicles of Magnus Bane", "Annina Henninger", 352, false,
                null);
        Book b3 = new Book("Pippi Langstrumpf", "Astrid Lindgren", 145, false,
                null);
        Book b4 = new Book("Half-blood Prince", "J.K. Rowling", 578, true,
                new GregorianCalendar(2019,3,28));
        Book b5 = new Book("Harry Potter", "J.K. Rowling", 798, false,
                null);

        Book[] books = {b1, b2, b3, b4, b5};

        System.out.println("ID   TITLE                         AUTHOR                   PAGES");
        System.out.println("-----------------------------------------------------------------");
        for(Book aBook : books){
            aBook.printBook();
        }
        DateFormat formatter = new SimpleDateFormat("dd. MMM yyyy");
        //formatter.setLenient(false);

        System.out.println(formatter.format(b1.rentStart.getTime()));
        System.out.println(formatter.format(b1.rentEnd.getTime()));
    }
}
