import user.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Book bookOne = new Book("Война и мир", "Исторический роман", 1300, 1869, 3000.19);
        Book bookTwo = new Book("Цветы для Элджернона", "Фантастический рассказ", 311, 1959, 569.89);
        Book bookThree = new Book("Мы", "Антиутопия", 208, 1920, 469.99);
        Book bookFour = new Book("Хроники Амбера", "Фантастический роман", 1650, 1991, 345.99);
        Book bookFive = new Book("Ночь в тоскливом октябре", "Фантастический роман", 384, 1993, 572.99);

        Administrator administrator = new Administrator("Oleg", "Gladkov", "Admin_098972346");
        administrator.enterLibrary();

        Reader reader = new Reader("Yana", "Gladkova", "Reader_0980984");
        reader.enterLibrary();

        Librarian librarian = new Librarian("Alex", "Ivanov", "Librarian_01934709285");
        librarian.enterLibrary();

        Supplier supplier = new Supplier("Viktor", "Smirnov", "Supplier_0187418");
        supplier.enterLibrary();



    }
}
