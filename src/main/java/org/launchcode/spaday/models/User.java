package org.launchcode.spaday.models;
import javax.validation.constraints.*;

public class User {

    @NotBlank(message = "Invalid Username. Try again.")
    @Size(min = 5, max = 15, message = "Name must be between 5 and 15 characters")
    private String username;

    @Email(message = "Invalid email. Try again.")
    private String email;

    @NotBlank(message = "Password is required.")
    @Min(6)
    private String password;

    private String verifyPassword;

    public String getVerifyPassword() {
        return verifyPassword;
    }

    public void setVerifyPassword(String verifyPassword) {
        this.verifyPassword = verifyPassword;
    }

    public User() {

    }
    public User(String username, String email, String password) {
        this();
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
