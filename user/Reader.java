package user;

public class Reader extends User implements usersInterfaces.Reader {
    public static int readersCount;
    protected String pass;

    public Reader (String name, String surname, String id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        pass = name + "_" + id;
        readersCount++;
        if (readersCount <= 5) {
            Administrator.readersPasses[readersCount - 1] = pass;
        } else {
            System.out.println("Слишком много читателей в библиотеке, ваше обслуживание в данный момент приостановлено!");
        }
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
