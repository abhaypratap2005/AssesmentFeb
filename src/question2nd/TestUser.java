package question2nd;

public class TestUser {
    public static void main(String[] args) {

        UserMap users = new UserMap();

        users.put("rahul", "1234");
        users.put("aman", "abcd");

        users.put("rahul", "9999"); //Exception will be here

    }
}