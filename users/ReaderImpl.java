package users;

import resources.*;
import usersInterfaces.Reader;

public class ReaderImpl extends User implements Reader {
    protected String pass;

    public ReaderImpl(String name, String surname, String id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        pass = name + "_" + id;
        status = false;

        if (LibraryDataBase.getTotalReaders() <= 5) {
            LibraryDataBase.addReaderPass(pass);
        } else {
            System.out.println("Слишком много читателей в библиотеке, ваше обслуживание в данный момент приостановлено!");
        }
    }

    public String getPass() {
        return pass;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public void enterLibrary() {
        System.out.printf("Читатель %s зашел в библиотеку\n", name + " " + surname);
    }

    @Override
    public void leaveLibrary() {
        System.out.printf("Читатель %s покинул библиотеку\n", name + " " + surname);
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
