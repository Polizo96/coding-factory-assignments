package gr.aueb.cf.testbed.ch11;

/**
 * A simple {@link User} Java Bean.
 *
 * @author nikospol
 */
public class User {
    private long id;
    private String firstname;
    private String lastname;

    public User() {}

    public User(long id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    /**
     * Prints a message that inserted user registered successfully.
     * @param user
     *              the inserted user.
     */
    public void registerUser(User user) {
        System.out.println(user + "user is registered successfully");
    }
}
