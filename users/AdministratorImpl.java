package users;

import resources.*;
import usersInterfaces.*;

public class AdministratorImpl extends User implements Administrator {

    public AdministratorImpl(String name, String surname, String id) {
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

    @Override
    public void checkPass(ReaderImpl reader) {
        String result = ", ваш читательский билет не найден в базе читателей. Обслуживание не может быть произведено.";
        for (String userPass : LibraryDataBase.getReadersPasses()) {
            if (reader.getPass().equals(userPass)) {
                result = ", ваш читательский билет успешно найден в базе читателей.";
                reader.setStatus(true);
                break;
            }
        }
        System.out.printf("%s %s%s\n", reader.getName(), reader.getSurname(), result);
    }

    @Override
    public void overdueNotification(User reader) {
        if (reader.readingBook != null) {
            System.out.printf("Сообщаю, что читатель %s %s просрочил срок возврата книги %s!\n", reader.getName(), reader.getSurname(), reader.getReadingBook().getName());
        }
    }

    @Override
    public void acceptBook(User reader) {
        if (reader.getReadingBook() != null) {
            System.out.printf("%s %s вернул книгу %s в библиотеку.\n", reader.getName(), reader.getSurname(), reader.getReadingBook().getName());
            reader.setReadingBook(null);
        } else {
            System.out.printf("%s %s не имеет на руках книг.\n", reader.getName(), reader.getSurname());
        }
    }

    @Override
    public void giveOutBook(User reader, Book book) {
        if (reader.isStatus()) {
            if (reader.getReadingBook() == null) {
                reader.setReadingBook(book);
                System.out.printf("%s %s успешно взял для прочтения книгу %s, необходимо вернуть книгу в течении следующего месяца.\n", reader.getName(), reader.getSurname(), book.getName());
            } else {
                System.out.printf("Сначало нужно будет вернуть книгу: %s в библиотеку!\n", reader.getReadingBook().getName());
            }

        } else {
            System.out.printf("Читатель %s %s не смог взять для прочтения книгу %s. Нужно предъявить читательский билет.\n", reader.getName(), reader.getSurname(), book.getName());
        }
    }
}
