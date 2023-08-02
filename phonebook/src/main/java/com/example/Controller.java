package com.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    View vi = new View();
    ArrayList<Person> persons = new ArrayList<>();
    public void runProgram() {

        Phone p = new Phone();
        SaveAFile save = new SaveAFile();


            String name = vi.input("Enter name: ");
            String surname = vi.input("Enter surname: ");
            String fatherName = vi.input("Enter father name or type '-' if none: ");
            String phoneNumber = p.validateNumbers();
            String dateOfBirth = handleDate();
            String gender = handleGender();

            addPerson(new Person(name, surname, fatherName, phoneNumber, dateOfBirth, gender));
            showPerson();
            save.saveTxt(new Person(name, surname, fatherName, phoneNumber, dateOfBirth, gender));
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

        while (true) {
            String gender = vi.input("Enter gender: ");
            try {
                if (gender.equalsIgnoreCase("f") || gender.equalsIgnoreCase("m")) {
                    return gender;
                } else {
                    throw new WrongGenderInputException(
                            "Invalid declaration of gender. Please, type 'f' if you are female or 'm' if male");
                }
            } catch (WrongGenderInputException e) {
                e.printStackTrace();
            }
        }

    }

    public String handleDate()
    {
        boolean temp = true;
        while (temp) {
            try {
                String stringDate = vi.input("Enter the date of birth using this format 'dd-MM-yyyy': ");
                String[] array = stringDate.split("-");
                if (Integer.parseInt(array[0]) > 31) throw new InvalidDateFormatException("The string is not a date.");
                if (Integer.parseInt(array[1]) > 12 || Integer.parseInt(array[1]) < 1)
                    throw new InvalidDateFormatException();
                if (Integer.parseInt(array[2]) > 2023) throw new InvalidDateFormatException("The string is not a date.");

                temp = false;
                return stringDate;
            } catch (InvalidDateFormatException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

}
