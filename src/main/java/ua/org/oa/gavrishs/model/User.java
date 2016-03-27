package ua.org.oa.gavrishs.model;

import javax.persistence.*;

/**
 * Created by Anna on 15.02.2016.
 */

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="email")
    private String email;

    @Column(name="user_surname")
    private String firstName;

    @Column(name="user_lastName")
    private String lastName;

    @Column(name="user_age")
    private int age;

    @Column(name="role")
    @Enumerated(EnumType.STRING)
    private ua.org.oa.gavrishs.model.Role role;

    public User(){}

    public User(String email, String firstName, String lastName, int age, Role role) {
        setEmail(email);
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setRole(role);
    }

    public User(User user) {
        this();

        setAge(user.getAge());
        setEmail(user.getEmail());
        setFirstName(user.getFirstName());
        setLastName(user.getLastName());
        setRole(user.getRole());
        setId(user.getId());
    }

    public long getId() { return id; }

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

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("id=").append(id);
        sb.append(", email='").append(email).append('\'');
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", age=").append(age);
        sb.append(", role=").append(role);
        sb.append('}');
        return sb.toString();
    }
}
