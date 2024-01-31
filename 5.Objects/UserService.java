import java.util.HashMap;

public class UserService {
    private static HashMap<String, User> users = new HashMap<>();

    static {
        User user = 
            new User("Wally", "wally@gmail.com", "abcdefg");
        users.put(user.getUsername(), user);
    }

    public Login authenticate(
            String username,
            String password)
    {
        User user = users.get(username);
        if (password.equals(user.getPassword())) {
            return user;
        }
        // fail the program with a not found exception
        throw new RuntimeException("User not found");
    }
}