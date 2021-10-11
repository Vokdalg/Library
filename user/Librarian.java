package user;

public class Librarian extends User {
    public Librarian (String name, String surname, String id) {
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
}
