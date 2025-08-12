package SOLID.DependencyInversion;

public class Main {
    public static void main(String[] args) {
        UserServiceInterface userService = new UserService();
        UserController controller = new UserController(userService);
        
        User user = new User("Nitesh choudhary", "niteshchoudhary1217@gmail .com");
        controller.createUser(user);
        
    }
}
