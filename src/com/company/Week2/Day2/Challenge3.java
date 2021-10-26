package com.company.Week2.Day2;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/**
 * Print the average of three numbers entered
 * by user by creating a class named 'Average'
 * having a method to calculate and print the average.
 */

// The average class is responsible for averaging numbers and
    // printing the result:
class Average {
    public void average(double a, double b, double c) {
        double average = (a + b + c)/3;
        System.out.println("Average: " + average);
    }


}

public class Challenge3 {
    public static void main(String[] args) {
        double a,b,c;
        // ask for input
        a = askInput();
        b = askInput();
        c = askInput();

        // calculate the average:
        Average avg = new Average();
        avg.average(a,b,c);
    }

    public static double askInput() {
        // this method asks for a double and then returns what the user types in:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        return scanner.nextDouble();
    }
}
