public class TestUserLogin {
    public static void main(String[] args) {
        UserService userService =new UserService();
        Login login=UserService.authenticate("wally@gmail.com","abcdefg");
        User user=(User) login;
        System.out.println("Hello, "+user.getName());
    }
}
