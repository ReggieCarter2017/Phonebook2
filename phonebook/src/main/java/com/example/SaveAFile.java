package com.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SaveAFile
{
    public void saveTxt(Person e)
    {
        String data = "Name: " + e.getName() + ". Surname: " + e.getSurname() + ". Father name: " + e.getFatherName()
        + e.getPhoneNumber() + ". Date of birth: " + e.getDateOfBirth() + ". Gender: " + e.getGender();
        String name = e.getSurname() + ".txt";
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(name));
            writer.write(data);
            writer.close();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}