package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (User u: users) {
            if (u.getUsername().equals(login)) {
                return u;
            }
        } throw new UserNotFoundException("Пользователя нет в списке");
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() < 3) {
            throw new UserInvalidException("Пользователь не валидный или имя состоит менее чем из 3х символов");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
            User user = findUser(users, "Petr Arsentev");
        if (validate(user)) {
            System.out.println("This user has an access");
            }
        } catch (UserInvalidException uin) {
            uin.printStackTrace();
        } catch (UserNotFoundException un) {
            un.printStackTrace();
        }
    }
}
