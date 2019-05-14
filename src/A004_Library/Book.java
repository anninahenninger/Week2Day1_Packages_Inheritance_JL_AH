package A004_Library;


import java.util.GregorianCalendar;

public class Book {

    String title;
    String author;
    int pages;
    static int counter = 100;
    int bookID;
    boolean isRented;
    final GregorianCalendar rentStart;
    GregorianCalendar rentEnd;

    public Book(String title, String author, int pages, boolean isRented, GregorianCalendar rentStart){
        this.title = title;
        this.author = author;
        this.pages = pages;
        counter++;
        this.bookID = counter;
        this.isRented = isRented;
        this.rentStart = rentStart;
        this.rentEnd = calcRentDur();
    }
    public void printbook(){
        System.out.printf("%-5d" +  "%-30s" + "%-25s" + "%d%n", bookID, title, author, pages);
    }
    public GregorianCalendar calcRentDur(){
        if(rentStart != null) {
            this.rentEnd = this.rentStart;
            this.rentEnd.add(GregorianCalendar.DATE, 2);
            }
        return this.rentEnd;
    }

}
