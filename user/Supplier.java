package user;

public class Supplier extends User {
    public Supplier (String name, String surname, String id) {
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
}
