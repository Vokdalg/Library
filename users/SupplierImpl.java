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
    public void takeOrderForProcessing() {
        System.out.println("Успешно сформирован и взят в обработку заказ на следующие книги:");
        LibraryDataBase.printOrder();
    }

    @Override
    public void readBook(Book book) {
        if (getReadingBook() == null) {
            setReadingBook(book);
            System.out.printf("Поставщик %s %s успешно взял для прочтения книгу %s\n", getName(), getSurname(), book.getName());
        } else {
            System.out.printf("Сначало нужно будет вернуть книгу: %s в библиотеку!\n", getReadingBook().getName());
        }
    }

    @Override
    public void returnBook() {
        if (getReadingBook() != null) {
            System.out.printf("Поставщик %s %s вернул кингу %s в библиотеку.\n", getName(), getSurname(), getReadingBook().getName());
            setReadingBook(null);
        } else {
            System.out.printf("Поставщик %s %s не имеет на руках книг.\n", getName(), getSurname());
        }
    }
}
