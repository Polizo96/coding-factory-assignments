package gr.aueb.cf.testbed.ch11;

public class Main {

    public static void main(String[] args) {
        User alice = new User(1, "Alice", "W.");
        UserCredentials aliceLogin = new UserCredentials(1, "AliceW", "alice12345");

        System.out.println("{" + alice.getId() + ", " + alice.getFirstname() +
                            ", " + alice.getLastname() + "}");

        System.out.println("{" + aliceLogin.getId() + ", " + aliceLogin.getUsername() +
                            ", " + aliceLogin.getPassword() + "}");
    }
}
