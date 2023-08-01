package com.example;

import java.util.Scanner;

public class Controller {
    public void runProgram()
    {
        View vi = new View();
        Phone p = new Phone();

        boolean temp = true;

        while (temp)
        {
            String name = vi.input("Enter name: ");
            String surname = vi.input("Enter surname: ");
            String phonenumber = vi.input("Enter phone number: ");
            String dateOfBirth = p.validateNumbers(addPhone());
            String sex = vi.input("Enter the gender of the person: ");
        }
    }

    public String addPhone()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter your phone number using only numbers: ");

        String tempNumber = sc.nextLine();

        return tempNumber;

        
    }



}
