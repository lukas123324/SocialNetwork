import java.time.LocalDate;

public class User {
    private String firstName;
    private String lastName;
    private String userName;
    private LocalDate birthDate;

    // Constructor
    public User(String firstName, String lastName, String userName, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.birthDate = birthDate;
    }

    // Getter + Setter
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    // toString
    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }

}
