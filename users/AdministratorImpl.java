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
    public void overdueNotification(ReaderImpl reader) {
        System.out.printf("Сообщаю, что читатель %s %s просрочил срок возврата книги %s!\n", reader.getName(), reader.getSurname(), reader.getReadingBook().getName());
    }

}
