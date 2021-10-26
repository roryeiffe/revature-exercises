package com.company.Week2.Day2;

import java.util.Scanner;

/**
 * Take name, roll number and field of interest from user and print in the format below :
 *      Hey, my name is xyz and my roll number is xyz. My field of interest are xyz.
 */

public class Challenge2 {
    public static void main(String[] args) {
        String name,field;
        int rollNumber;
        Scanner stringScanner = new Scanner(System.in);
        Scanner intScanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        name = stringScanner.nextLine();
        System.out.println("Please enter your roll number: ");
        rollNumber = intScanner.nextInt();
        System.out.println("Please enter your field of interest: ");
        field = stringScanner.nextLine();

        System.out.println("Hey, my name is " + name + " and my roll number is " + rollNumber + ". My field of interest is " + field + ".");
    }
}
