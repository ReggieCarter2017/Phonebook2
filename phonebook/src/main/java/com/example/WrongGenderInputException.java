package com.example;

public class WrongGenderInputException extends Exception {
    public WrongGenderInputException()
    {

    }

    public WrongGenderInputException(String msg)
    {
        super(msg);
    }
}