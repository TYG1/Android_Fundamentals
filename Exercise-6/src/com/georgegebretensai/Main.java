package com.georgegebretensai;

/**
 * Created by George on 3/4/16.
 */
public class Main {

    public static void main(String[] args){
        UserInput input = new UserInput();
        double aNumber = input.promptDouble("Enter a double.");
        System.out.println("Twice your number is " + 2 * aNumber);
    }
}