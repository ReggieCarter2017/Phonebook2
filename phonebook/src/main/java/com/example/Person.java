package com.example;

public class Person {
    private String name;
    private String surname;
    private String fatherName;
    private String phoneNumber;
    private String dateOfBirth;
    private String gender;

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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String sex) {
        this.gender = sex;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public Person() {
        name = null;
        surname = null;
        fatherName = null;
        phoneNumber = null;
        dateOfBirth = null;
        gender = null;
    }

    public Person(String name, String surname, String fatherName, String phoneNumber, String dateOfBirth, String sex) {
        this.name = name;
        this.surname = surname;
        this.fatherName = fatherName;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.gender = sex;
    }

}
