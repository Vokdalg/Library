package users;
import resources.*;

public class ReaderImpl extends User implements usersInterfaces.Reader {
    protected String pass;
    private boolean status = false;

    public ReaderImpl(String name, String surname, String id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        pass = name + "_" + id;

        if (LibraryDataBase.getTotalReaders() <= 5) {
            LibraryDataBase.addReaderPass(pass);
        } else {
            System.out.println("Слишком много читателей в библиотеке, ваше обслуживание в данный момент приостановлено!");
        }
    }

    public String getPass() {
        return pass;
    }

    public boolean isStatus() {
        return status;
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
    public void readBook(Book book) {
        if (isStatus()) {
            setReadingBook(book);
            System.out.printf("Читатель %s %s успешно взял для прочтения книгу %s\n", getName(), getSurname(), book.getName());
        } else {
            System.out.printf("Читатель %s %s не смог взять для прочтения книгу %s. Нужно предъявить читательский билет.\n", getName(), getSurname(), book.getName());
        }
    }
}
