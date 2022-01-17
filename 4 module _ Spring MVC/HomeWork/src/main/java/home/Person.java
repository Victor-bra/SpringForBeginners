package home;

import home.validation.checkEmail.CheckEmail;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.HashMap;
import java.util.Map;

public class Person {
    @NotBlank(message = "Please, write you name")
    @Size(min = 2, message = "Name must be min 2 symbols")
    private String name;
    @NotBlank(message = "Please, write you surname")
    @Size(min = 2, message = "Surname must be min 2 symbols")
    private String surname;
    @Pattern(regexp = "(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)", message = "Please, write in format XX/XX/XXXX")
    private String dateOfBirth;
    private String sex;
    private Map<String, String> sex_s;
    @Pattern(regexp = "\\+\\d{3} \\d{2} \\d{3}-\\d{2}-\\d{2}", message = "Please, use format +XXX XX XXX-XX-XX")
    private String phoneNumber;
    @CheckEmail
    private String email;

    public Person() {
        sex_s = new HashMap<>();
        sex_s.put("FeMail", "F");
        sex_s.put("Mail", "M");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Map<String, String> getSex_s() {
        return sex_s;
    }

    public void setSex_s(Map<String, String> sex_s) {
        this.sex_s = sex_s;
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", sex='" + sex + '\'' +
                ", sex_s=" + sex_s +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
