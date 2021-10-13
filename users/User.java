package users;

public abstract class User {
    protected String name;
    protected String surname;
    protected String id;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getId() {
        return id;
    }

    public abstract void enterLibrary();
    public abstract void leaveLibrary();

}
