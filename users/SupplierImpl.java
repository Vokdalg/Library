package users;

import usersInterfaces.Reader;
import usersInterfaces.Supplier;
import resources.*;

public class SupplierImpl extends User implements Supplier, Reader {
    public SupplierImpl(String name, String surname, String id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    @Override
    public void enterLibrary() {
        System.out.printf("Поставщик %s зашел в библиотеку\n", name + " " + surname);
    }

    @Override
    public void leaveLibrary() {
        System.out.printf("Поставщик %s покинул библиотеку\n", name + " " + surname);
    }

    @Override
    public void transferOrder(LibrarianImpl librarian) {
        System.out.printf("Поставщик %s %s передал библиотекарю %s %s следующие книги: ", getName(), getSurname(), librarian.getName(), librarian.getSurname());
        LibraryDataBase.printOrder();
    }

    @Override
    public void readBook(AdministratorImpl administrator, Book book) {
        administrator.giveOutBook(this, book);
    }

    @Override
    public void returnBook(AdministratorImpl administrator) {
        administrator.acceptBook(this);
    }
}
