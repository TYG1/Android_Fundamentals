package com.Week_02;


/*
        Suppose the high temperature (in degrees Fahrenheit) for each of next week's days are
         45, 29, 10, 22, 41, 28, and 33 and the probability of precipitation for each of the
         next five days is 95%, 60%, 25%, 5%, 0%, 75%, and 90%.  Write a program using a loop
         that displays the day of the week if that day's high temperature is less than or equal
         to 32 and the probability of precipitation is greater than 50% (meaning it's likely to snow).
*/

public class Main {

    public static void main(String[] args) {
        int[] temperature = {45, 29, 10, 22, 41, 28, 33};

        double[] precipitation = {95, 60, 25, 5, 0, 74, 90};

        int dailyReport[][] = {{45, 95},
                {29, 60},
                {10, 25},
                {22, 5},
                {41, 0},
                {28, 74},
                {33, 90},
        };

        System.out.println(dailyReport[0][0]);

         for ( int i = 0; i < dailyReport[][].length; ++i )

//        for (double precip : precipitation) {
//            System.out.println(precip);
//        }
//    }
    }
}
