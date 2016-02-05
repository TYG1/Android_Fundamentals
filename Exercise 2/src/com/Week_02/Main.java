package com.Week_02;

//Write a program that prompts a user to enter a temperature in Fahrenheit, converts it to Celsius, and displays the Celsius temperature.
//        Separate the code that collects user input, the code that converts temperatures, and the code that displays the output into
//        different methods.  The program should repeat until the user enters a value less that -460
//        (approximately absolute zero).



public class Main {

    public class Main {

    static double getUserFahrenheit(){
        java.util.Scanner scanner = new java.util.Scanner(System.in);]
        System.out.println("Enter a Fahrenheir temperature.");
        String userInput = scanner.nextLine();
        return Double.parseDouble(userInput);
    }

     static double fToC(double fTemp){
        return 5.0/9 * (fTemp-32);
     }

     static void display(double cTemp){
         System.out.println("The celsius temperature is " + cTemp);
     }

     public static void main(String[] args) {
        double fTemp = getUserFahrenheit();

         while (fTemp >= -460){
          double cTemp = fToC(fTemp);
          display(cTemp);
          fTemp = getUser Fahrenheit();
     }

     }







    }