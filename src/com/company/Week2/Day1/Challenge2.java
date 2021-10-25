package com.company.Week2.Day1;

/*
Exercise 2# EMI Calculator:

Create an EMI Calculator app

Input:
Loan Amount
Rate of Interest
Tenure

Output:
EMI:__________


 */

import com.company.Week2.Day1.Challenge1;

import java.util.Scanner;

public class Challenge2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int P = Challenge1.acceptInt("Please enter the loan amount:");
        double r = Challenge1.acceptDouble("Please enter the rate of interest (%): ");
        r = r/100;
        int n = Challenge1.acceptInt("Please enter your tenure in months");

        double EMI = P * r * Math.pow(1 + r,n) / (Math.pow(1 + r,n) - 1);
        System.out.println("EMI: " + EMI);
    }
}
