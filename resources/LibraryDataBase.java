package resources;

import java.util.Arrays;

public class LibraryDataBase {
    private static String[] readersPasses = new String[5];
    private static int totalReaders = 0;
    private static int totalBooks = 0;
    private static Book[] books = new Book[5];
    private static String[] booksForOrder = new String[5];

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
        LibraryDataBase.totalBooks++;
        LibraryDataBase.books[totalBooks - 1] = book;
    }

    public static String[] getBooksForOrder() {
        return booksForOrder;
    }

    public static void printOrder() {
        System.out.println(Arrays.toString(booksForOrder));
    }

    public static void addBookForOrder(String orderBook) {
        for (int i = 0; i < LibraryDataBase.getBooksForOrder().length; i++) {
            if (LibraryDataBase.booksForOrder[i] == null) {
                LibraryDataBase.booksForOrder[i] = orderBook;
                System.out.printf("Книга %s добавлена в заказ.\n", orderBook);
                return;
            } else if (LibraryDataBase.booksForOrder[i].equals(orderBook)) {
                System.out.printf("Книга %s уже находится в заказе.\n", orderBook);
                return;
            }
        }
        System.out.println("Список заказа полон");
    }

    public static void addReaderPass(String pass) {
        LibraryDataBase.totalReaders++;
        LibraryDataBase.readersPasses[LibraryDataBase.getTotalReaders() - 1] = pass;
    }
}
