package com.example;

import java.util.Scanner;

public class Controller {
    public void runProgram()
    {

    }

    public String addPhone()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter your phone number using only numbers: ");

        String tempNumber = sc.nextLine();

        return tempNumber;

        
    }



}
