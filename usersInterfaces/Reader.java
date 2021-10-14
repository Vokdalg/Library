package usersInterfaces;

import resources.*;
import users.AdministratorImpl;

public interface Reader {
    void readBook(AdministratorImpl administrator, Book book);

    void returnBook(AdministratorImpl administrator);
}
