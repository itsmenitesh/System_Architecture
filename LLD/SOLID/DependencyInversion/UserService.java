package SOLID.DependencyInversion;

public class UserService implements UserServiceInterface {
    @Override
    public void createUser(User user) {
        System.out.println("User created: " + user.getName());
    }
}
