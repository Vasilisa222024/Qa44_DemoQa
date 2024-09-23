package manager.dto;

import manager.enumps.Gender;
import manager.enumps.Hobbies;

import java.util.List;

public class StudentDTO {
    private String name;
    private String lastName;
    private String email;
    private Gender gender;
    private String mobile;
    private String dateOfBirth;
    private String subject;
    private List<Hobbies> hobbies;
    private String pictures;
    private String currentAddress;
    private String state;
    private String city;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public List<Hobbies> getHobbies() {
        return hobbies;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getSubject() {
        return subject;
    }

    public String getPictures() {
        return pictures;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public StudentDTO(String name, String lastName, String email, Gender gender, String mobile,
                      String dateOfBirth, String subject, List<Hobbies> hobbies, String pictures,
                      String currentAddress, String state, String city) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.mobile = mobile;
        this.dateOfBirth = dateOfBirth;
        this.subject = subject;
        this.hobbies = hobbies;
        this.pictures = pictures;
        this.currentAddress = currentAddress;
        this.state = state;
        this.city = city;
    }
}
