package user;

public abstract class User {
    String name;
    String surname;
    String id;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    public abstract void enterLibrary();
    public abstract void leaveLibrary();

}
