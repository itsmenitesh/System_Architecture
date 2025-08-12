package SOLID.DependencyInversion;

public class UserController {
    private UserServiceInterface userService;
    
    public UserController(UserServiceInterface userService) {
        this.userService = userService;
    }
    
    public void createUser(User user) {
        userService.createUser(user);
    }
}
