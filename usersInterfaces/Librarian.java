package usersInterfaces;

import users.SupplierImpl;

public interface Librarian {
    void orderBook(SupplierImpl supplier, String book);
}
