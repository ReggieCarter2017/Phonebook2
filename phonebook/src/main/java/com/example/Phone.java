package com.example;

public class Phone {
    private String number;

    public Phone() {

    }

    public Phone(String number) {
        this.number = number;
    }

    public String validateNumbers() {
        String finalNumber = "";
        View vi = new View();
        boolean temp = true;

        while (temp)
        {
            String number = vi.input("Please, enter your phone number using only numbers: ");
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

                } catch (TooMuchNumbersException | NumberFormatException | StringIsBlankException e) {
                    e.printStackTrace();
                }

            if (finalNumber.toCharArray().length > 11) temp = false;
        }
        return finalNumber;

    }

    public static boolean checkIfParseable(String num) {
        if (num == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(num);
        } catch (NumberFormatException nfe) {
            nfe.printStackTrace();
            return false;
        }
        return true;
    }
}
