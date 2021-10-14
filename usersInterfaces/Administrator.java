package usersInterfaces;

import users.ReaderImpl;
public interface Administrator {
    void checkPass(ReaderImpl reader);
    void overdueNotification(ReaderImpl reader);
}
