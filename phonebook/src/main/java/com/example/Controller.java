package com.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

    ArrayList<Person> persons = new ArrayList<>();

    public void runProgram() {
        View vi = new View();
        Phone p = new Phone();
        SaveAFile save = new SaveAFile();

        boolean temp = true;

        while (temp) {
            String name = vi.input("Enter name: ");
            String surname = vi.input("Enter surname: ");
            String fatherName = vi.input("Enter father name or type '-' if none: ");
            String phoneNumber = p.validateNumbers();
            String dateOfBirth = vi.input("Enter date of birth: ");
            String gender = handleGender();

            addPerson(new Person(name, surname, fatherName, phoneNumber, dateOfBirth, gender));
            showPerson();
            save.saveTxt(new Person(name, surname, fatherName, phoneNumber, dateOfBirth, gender));
            

        }
    }

    public void addPerson(Person p) {
        persons.add(p);
    }

    public void showPerson() {
        for (Person e : persons)
            System.out.println("Name: " + e.getName()
                    + "\nSurname: " + e.getSurname() +
                    "\nFather name: " + e.getFatherName() +
                    "\nPhone number: " + e.getPhoneNumber() +
                    "\nDate of birth: " + e.getDateOfBirth()
                    + "\nGender: " + e.getGender());
    }

    public String handleGender() {
        View vi = new View();

        while (true) {
            String gender = vi.input("Enter gender: ");
            try {
                if (gender.toLowerCase().equals("f") || gender.toLowerCase().equals("m")) {
                    return gender;
                } else {
                    throw new WrongGenderInputException(
                            "Invalid declaration of gender. Please, type 'f' if you are female or 'm' if male");
                }
            } catch (WrongGenderInputException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    public String handleDate()
    {
        View vi = new View();

        while (true) {
            String gender = vi.input("Enter gender: ");
            try {
                if (gender.toLowerCase().equals("f") || gender.toLowerCase().equals("m")) {
                    return gender;
                } else {
                    throw new WrongGenderInputException(
                            "Invalid declaration of gender. Please, type 'f' if you are female or 'm' if male");
                }
            } catch (WrongGenderInputException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
