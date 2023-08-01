package com.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

    ArrayList<Person> persons = new ArrayList<>();

    public void runProgram() {
        View vi = new View();
        Phone p = new Phone();

        boolean temp = true;

        while (temp) {
            String name = vi.input("Enter name: ");
            String surname = vi.input("Enter surname: ");
            String phoneNumber = p.validateNumbers(addPhone("Enter phone number: "));
            String dateOfBirth = vi.input("Enter date of birth: ");
            String sex = vi.input("Enter the gender of the person: ");

            addPerson(new Person(name, surname, phoneNumber, dateOfBirth, sex));
            showPerson();
        }
    }

    public String addPhone(String string) {
        System.out.println(string);
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter your phone number using only numbers: ");

        String tempNumber = sc.nextLine();

        return tempNumber;

    }

    public void addPerson(Person p)
    {
        persons.add(p);
    }


    public void showPerson()
    {
        for (Person e : persons)
        System.out.println("Name: " + e.getName()
        + "\nSurname: " + e.getSurname() +
        "\nPhone number: " + e.getPhoneNumber() +
        "\nDate of birth: " + e.getDateOfBirth()
        + "\nGender: " + e.getSex());
    }

}
