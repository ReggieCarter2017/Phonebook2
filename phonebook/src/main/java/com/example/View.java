package com.example;

import java.util.Scanner;

public class View {
    Scanner sc = new Scanner(System.in);

    public String input() {
        try {
            String string = sc.nextLine();
            if (!string.isBlank()) {
                throw new StringIsBlankException("You entered an empty value.");
            }
            else {
                return string;
            }
        } catch (StringIsBlankException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
