import resources.*;
import users.*;

public class Main {
    public static void main(String[] args) {
        LibraryDataBase libraryBase = new LibraryDataBase();
        Book bookOne = new Book("Война и мир", "Исторический роман", 1300, 1869, 3000.19);
        Book bookTwo = new Book("Цветы для Элджернона", "Фантастический рассказ", 311, 1959, 569.89);
        Book bookThree = new Book("Мы", "Антиутопия", 208, 1920, 469.99);
        Book bookFour = new Book("Хроники Амбера", "Фантастический роман", 1650, 1991, 345.99);
        Book bookFive = new Book("Ночь в тоскливом октябре", "Фантастический роман", 384, 1993, 572.99);

        AdministratorImpl administrator = new AdministratorImpl("Oleg", "Gladkov", "Admin_098972346");
        administrator.enterLibrary();

        ReaderImpl reader = new ReaderImpl("Yana", "Gladkova", "Reader_0980984");
        reader.enterLibrary();

        ReaderImpl reader1 = new ReaderImpl("Dmitriy", "Maslov", "Reader_983459");
        reader1.enterLibrary();

        LibrarianImpl librarian = new LibrarianImpl("Alex", "Ivanov", "Librarian_01934709285");
        librarian.enterLibrary();

        SupplierImpl supplier = new SupplierImpl("Viktor", "Smirnov", "Supplier_0187418");
        supplier.enterLibrary();

        reader.readBook(administrator, bookOne);
        administrator.checkPass(reader);
        reader.readBook(administrator, bookOne);
        administrator.overdueNotification(reader);
        reader.readBook(administrator, bookTwo);
        reader.returnBook(administrator);
        reader.readBook(administrator, bookTwo);
        reader1.returnBook(administrator);
        librarian.orderBook(supplier,"Дюна");
        librarian.orderBook(supplier, "Над кукушкиным гнездом");
        librarian.orderBook(supplier,"Идиот");
        librarian.orderBook(supplier, "Вся королевская рать");
        librarian.orderBook(supplier, "В круге первом");
        librarian.orderBook(supplier, "Дюна");
        librarian.orderBook(supplier, "Том Сойер");
        supplier.transferOrder(librarian);
        supplier.readBook(administrator, bookFour);
        supplier.readBook(administrator, bookFive);
        supplier.returnBook(administrator);
    }
}
