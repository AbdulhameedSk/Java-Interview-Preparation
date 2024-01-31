public class TestUserLogin {
    public static void main(String[] args) {
        UserService userService =new UserService();
        userService.authenticate("abdul@gmail.com","abc");
    }
}
