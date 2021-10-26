package com.company.Week2.Day2;

import java.util.Scanner;

/**
 * Ask user to give two double input for length and breadth of a rectangle and print area type casted to int.
 */

public class Challenge1 {

    public static void main(String[] args) {
        double length, breadth;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length of the rectangle");
        length = scanner.nextDouble();
        System.out.println("Please enter the breadth of the rectangle");
        breadth = scanner.nextDouble();

        System.out.println("The area of the rectangle is: " + (int)(length*breadth));
    }
}
