package users;

import resources.Book;

public abstract class User {
    protected String role;
    protected String name;
    protected String surname;
    protected String id;
    protected Book readingBook;
    protected boolean status = true;

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

    public boolean isStatus() {
        return status;
    }

    public Book getReadingBook() {
        return readingBook;
    }

    public void setReadingBook(Book readingBook) {
        this.readingBook = readingBook;
    }

    public void enterLibrary(){
        System.out.printf(role + " %s зашел в библиотеку\n", name + " " + surname);
    }

    public void leaveLibrary(){
        System.out.printf(role + " %s покинул библиотеку\n", name + " " + surname);
    }

}
