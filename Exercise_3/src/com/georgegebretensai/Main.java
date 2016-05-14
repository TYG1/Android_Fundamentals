package com.georgegebretensai;

public class Main {
    //Suppose the high temperature (in degrees Fahrenheit) for each of next week's
    //days are 45, 29, 10, 22, 41, 28, and 33 and the probability of precipitation
    //for each of the next five days is 95%, 60%, 25%, 5%, 0%, 75%, and 90%.
    //Write a program using a loop that displays the day of the week if that day's
    //high temperature is less than or equal to 32 and the probability of precipitation
    //is greater than 50% (meaning it's likely to snow).
    //
    public static void main(String[] args) {

        String[] weekDays= {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int[] temps = {45, 29, 10, 22, 41, 28, 33};
        int[] prec = {95, 60, 25, 5, 0, 75, 90};

        for (int index = 0; index < weekDays.length; index++){
            if ((temps[index] <= 32) && (prec[index] > 50)){
                System.out.println(weekDays[index]);
            }
        }
    }
}
