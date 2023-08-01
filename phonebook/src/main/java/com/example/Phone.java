package com.example;

public class Phone {
    private String number;

    public Phone() {

    }

    public Phone(String number) {
        this.number = number;
    }

    public String validateNumbers(String number) {
        String finalNumber = "";
        try {

            if (number.isEmpty()) {
                throw new StringIsBlankException("You entered an empty value.");
            }

            if (number.length() != 11) {
                throw new TooMuchNumbersException("Phone number has to be at least 11 characters long.");
            }

            if (!(checkIfParseable(number))) {
                throw new NumberFormatException("Digits must be only numbers");
            }

            for (int i = 0; i < number.length(); i++) {
                switch (i) {
                    case 0:
                        finalNumber = finalNumber + "+" + number.toCharArray()[i];
                        break;
                    case 1:
                        finalNumber = finalNumber + "(" + number.toCharArray()[i];
                        break;
                    case 4:
                        finalNumber = finalNumber + ")" + number.toCharArray()[i];
                        break;
                    case 7:
                        finalNumber = finalNumber + "-" + number.toCharArray()[i];
                        break;
                    case 9:
                        finalNumber = finalNumber + "-" + number.toCharArray()[i];
                        break;
                    default:
                        finalNumber += number.toCharArray()[i];
                        break;
                }
            }

        } catch (TooMuchNumbersException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException s) {
            System.out.println(s.getMessage());
        } catch (StringIsBlankException b) {
            System.out.println(b.getMessage());
        }

        return finalNumber;

    }

    public boolean checkIfParseable(String s) {
        try {
            Integer.valueOf(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
