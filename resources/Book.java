package resources;

public class Book {
    private int numberOfReaders;
    private String name;
    private String genre;
    private int numberOFSheets;
    private int year;
    private double price;


    public Book(String name, String genre, int numberOFSheets,int year, double price) {
        this.name = name;
        this.genre = genre;
        this.numberOFSheets = numberOFSheets;
        this.year = year;
        this.price = price;

        if (LibraryDataBase.getTotalBooks() <= 5) {
            LibraryDataBase.addBook(this);
        } else {
            System.out.println("Библиотека переполнена");
        }
    }

    public int getNumberOfReaders() {
        return numberOfReaders;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public int getNumberOFSheets() {
        return numberOFSheets;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", numberOFSheets=" + numberOFSheets +
                ", year=" + year +
                '}';
    }
}