package com.example;

public class Person {
    private String name;
    private String surname;
    private String phoneNumber;
    private String dateOfBirth;
    private String sex;

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Person()
    {
        name = null;
        surname = null;
        phoneNumber = null;
        dateOfBirth = null;
        sex = null;
    }

    public Person(String name, String surname, String phoneNumber, String dateOfBirth, String sex)
    {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
    }

}
