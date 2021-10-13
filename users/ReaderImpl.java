package users;
import resources.LibraryDataBase;

public class ReaderImpl extends User implements usersInterfaces.Reader {
    protected String pass;

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

    @Override
    public void enterLibrary() {
        System.out.printf("Читатель %s зашел в библиотеку\n", name + " " + surname);
    }

    @Override
    public void leaveLibrary() {
        System.out.printf("Читатель %s покинул библиотеку\n", name + " " + surname);
    }
}
