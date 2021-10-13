package resources;

public class LibraryDataBase {
    private static String[] readersPasses = new String[5];
    private static int totalReaders = 0;
    private static int totalBooks = 0;
    private static Book[] books = new Book[5];

    public static Book[] getBooks() {
        return books;
    }

    public static String[] getReadersPasses() {
        return readersPasses;
    }

    public static int getTotalReaders() {
        return totalReaders;
    }

    public static int getTotalBooks() {
        return totalBooks;
    }

    public static void addBook(Book book) {
        LibraryDataBase.totalBooks ++;
        LibraryDataBase.books[totalBooks - 1] = book;
    }

    public static void addReaderPass(String pass) {
        LibraryDataBase.totalReaders ++;
        LibraryDataBase.readersPasses[LibraryDataBase.getTotalReaders() - 1] = pass;
    }
}
