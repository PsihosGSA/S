package oracle.academy.model;

/**
 * Created by Anna on 15.02.2016.
 */
public class User {
    private long id;
    private String email;
    private String firstName;
    private String lastName;
    private int age;
    private String role;
    private static int idUsers = 0;

    public User(String email, String firstName, String lastName, int age, String role) {
        setId();
        setEmail(email);
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setRole(role);
    }

    public long getId() {
        return id;
    }

    public void setId() {
        this.id = ++idUsers;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public static int getIdUsers() {
        return idUsers;
    }

    public static void setIdUsers(int idUsers) {
        User.idUsers = idUsers;
    }
}
