package usersInterfaces;

import resources.Book;
import users.ReaderImpl;
import users.User;

public interface Administrator {
    void checkPass(ReaderImpl reader);

    void overdueNotification(User reader);

    void acceptBook(User reader);

    void giveOutBook(User reader, Book book);
}
