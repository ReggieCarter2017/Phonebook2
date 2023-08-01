package com.example;

public class Main {
    public static void main(String[] args) {
        Phone p = new Phone();
        Controller c = new Controller();


        String d = p.validateNumbers(c.addPhone());

        System.out.println(d);

    }
}