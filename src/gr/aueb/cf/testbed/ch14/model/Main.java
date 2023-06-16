package gr.aueb.cf.testbed.ch14.model;

public class Main {

    public static void main(String[] args) {
        User alice = new User();
        UserCredentials aliceCredentials = new UserCredentials();

        alice.setUserId(1);
        alice.setFirstname("Alice");
        alice.setLastname("W.");

        aliceCredentials.setUserCredentialsId(alice.getUserId());
        aliceCredentials.setUsername("Alice123");
        aliceCredentials.setPassword("12345");

        System.out.println("Alice ID: " + alice.getUserId());
        System.out.println("Alice firstname: " + alice.getFirstname());
        System.out.println("Alice lastname: " + alice.getLastname());
        System.out.println("Alice username: " + aliceCredentials.getUsername());
        System.out.println("Alice password: " + aliceCredentials.getPassword());
    }
}
