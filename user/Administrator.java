package user;

public class Administrator extends User implements usersInterfaces.Administrator {
    protected static String[] readersPasses = new String[5];

    public Administrator (String name, String surname, String id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    @Override
    public void enterLibrary() {
        System.out.printf("Администратор %s зашел в библиотеку\n", name + " " + surname);
    }

    @Override
    public void leaveLibrary() {
        System.out.printf("Администратор %s покинул библиотеку\n", name + " " + surname);
    }


}
