package StaticFactoryDesignPattern;

public class StaticFactoryMethod {

    public static User createSimpleUser() {
        User user = new User();
        user.setFirstName("TestUser");
        user.setLastName("TestLastName");
        user.setPassword("pwd");
        user.setAge(27);
        return user;
    }

    public static User createUserFromFirstName(String firstName) {
        User user = new User();
        user.setFirstName(firstName);
        return user;
    }

    public static User createUserFromLastName(String lastName) {
        User user = new User();
        user.setLastName(lastName);
        return user;
    }

    public static User createUserFromPassword(String password) {
        User user = new User();
        user.setPassword(password);
        return user;
    }

    public static User createUserFromBirthDate(int year) {
        User user = new User();
        user.setAge(2017 - year);
        return user;
    }
}
