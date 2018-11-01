package cv.mmix.working.domain;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "employer")
public class Employer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "This field cannot be empty")
    private String responsiblePerson;

    @NotBlank(message = "This field cannot be empty")
    private String companyName;

    @NotBlank(message = "This field cannot be empty")
    private String phoneNumber;

    @Email(message = "Email is not correct")
    @NotBlank(message = "Email cannot be empty")
    private String email;

    @NotBlank(message = "Password cannot be empty")
    private String password;

    @Transient
    private String password2;

    private String activationCode;
    private boolean isActive;
    private boolean isBlocked;

    public Employer() {
    }

    public Employer(@NotBlank(message = "This field cannot be empty") String phoneNumber, @Email(message = "Email is not correct") @NotBlank(message = "Email cannot be empty") String email, @NotBlank(message = "Password cannot be empty") String password, String password2, String activationCode, boolean isActive, boolean isBlocked) {
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
        this.password2 = password2;
        this.activationCode = activationCode;
        this.isActive = isActive;
        this.isBlocked = isBlocked;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getResponsiblePerson() {
        return responsiblePerson;
    }

    public void setResponsiblePerson(String responsiblePerson) {
        this.responsiblePerson = responsiblePerson;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    public String getActivationCode() {
        return activationCode;
    }

    public void setActivationCode(String activationCode) {
        this.activationCode = activationCode;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

}
