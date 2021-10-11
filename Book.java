public class Book {
    protected static int totalBooks;
    protected int numberOfReaders;
    String name;
    String genre;
    int numberOFSheets;
    int year;
    protected double price;
    protected static Book[] books = new Book[5];

    public Book(String name, String genre, int numberOFSheets,int year, double price) {
        this.name = name;
        this.genre = genre;
        this.numberOFSheets = numberOFSheets;
        this.year = year;
        this.price = price;
        this.numberOfReaders = 0;
        totalBooks++;

        if (totalBooks <= 5) {
            books[totalBooks - 1] = this;
        } else {
            System.out.println("Библиотека переполнена");
        }
    }
}