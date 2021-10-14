package users;

import resources.LibraryDataBase;
import usersInterfaces.Librarian;
import usersInterfaces.Supplier;

public class LibrarianImpl extends User implements Librarian {
    public LibrarianImpl(String name, String surname, String id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    @Override
    public void enterLibrary() {
        System.out.printf("Библиотекарь %s зашел в библиотеку\n", name + " " + surname);
    }

    @Override
    public void leaveLibrary() {
        System.out.printf("Библиотекарь %s покинул библиотеку\n", name + " " + surname);
    }

    @Override
    public void orderBook(SupplierImpl supplier, String orderBook) {
        LibraryDataBase.addBookForOrder(supplier, orderBook);
        System.out.println();
    }
}