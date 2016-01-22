package com.Excercise1;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

       String city = "";
       String zipCode = "";
       double[] nextFiveTemperatures = new double[5];
       double tempSum = 0.0;

     // Get city from user
     System.out.print("Please enter city: ");
     city =  in.nextLine();

     // Get zip code from user
     System.out.print("Please enter zip code: ");
     zipCode = in.nextLine();

     // Dsiplay instructions and purpose for entering temperatures for 5 days
     System.out.println("Enter the high temperature for the next five days, beginning with tomorrow!");

        // Collects 5 temperatures from user and stores them in the nexFiveTemperatures array
        for (int i = 0; i < 5; i++)
        {
            System.out.print("Please enter temperature: ");
            nextFiveTemperatures[i] = in.nextDouble();
        }

        //  Calculates sum of temperatures
        for( double num : nextFiveTemperatures) {
                  tempSum+=num;
        }

        double tempAverage = tempSum/5;

        System.out.println("** Weather Report **");
        System.out.println("** City ** : " + city);
        System.out.println("** Zip Code **: " + zipCode);
        System.out.println("** 5 day average high temprature **: " + tempAverage);

    }
}
