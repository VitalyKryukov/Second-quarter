package Seminar3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {

    private String lastName;
    private String firstName;
    private String middleName;
    private LocalDate dateOfBirth;
    private String phoneNumber;
    private char sex;

    public void setData(String lastName, String firstName, String middleName, LocalDate dateOfBirth, String phoneNumber, char sex) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.sex = sex;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        String dateOfBirthString = dateOfBirth.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        return String.format("<%s><%s><%s><%s><%s><%s>", lastName, firstName, middleName, dateOfBirthString, phoneNumber, sex);
    }
}
