package com.example;

public class TooMuchNumbersException extends Exception{
    public TooMuchNumbersException()
    {

    }

    public TooMuchNumbersException(String msg)
    {
        super(msg);
    }
}
