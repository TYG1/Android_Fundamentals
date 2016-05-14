package com.georgegebretensai;

import java.util.Scanner;
import java.util.*;

public class UserInput {
    Scanner scanner = new Scanner(System.in);

    public int promptInt(String message){
        System.out.println(message);
        String userInput = scanner.nextLine();
        int userInt = 0;
        boolean isInt = false;

        while (!isInt) {
            try {
                userInt = Integer.parseInt(userInput);
                isInt = true;
            }
            catch (NumberFormatException e) {
                System.out.println(userInput + " is not an integer. "
                        + message);
                userInput = scanner.nextLine();
            }
        }

        return userInt;
    }

    public double promptDouble(String message){
        System.out.println(message);
        String userInput = scanner.nextLine();
        double userDouble = 0;
        boolean isDouble = false;

        while (!isDouble) {
            try {
                userDouble = Double.parseDouble(userInput);
                isDouble = true;
            }
            catch (NumberFormatException e) {
                System.out.println(userInput + " is not an double. "
                        + message);
                userInput = scanner.nextLine();
            }
        }

        return userDouble;
    }

    public String promptString(String message){
        System.out.println(message);
        String userInput = scanner.nextLine();
        return userInput;
    }
}

