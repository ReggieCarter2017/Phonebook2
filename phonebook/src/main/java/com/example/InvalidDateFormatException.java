package com.example;

public class InvalidDateFormatException extends Exception{
    public InvalidDateFormatException() {
    }

    public InvalidDateFormatException(String message) {
        super(message);
    }
}
