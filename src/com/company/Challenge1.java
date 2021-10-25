package com.company;

/*
# Create a caluculator app
----------------------------
Enter First Number :
Enter Second Number:

Select Option:
1 - Add
2 - Subtract
3 - Multiple
4 - Divide

Result: _______

 */

import java.util.Scanner;

public class Challenge1 {

    public static void main(String[] args) {
        double first = acceptDouble("Please enter your first number: ");
        double second = acceptDouble("Please enter your second number: ");

        System.out.println("Selection Option:");
        System.out.println("1 - Add");
        System.out.println("2 - Subtract");
        System.out.println("3 - Multiply");
        System.out.println("4 - Divide");

        int option = acceptInt("Please enter your selection: ");

        if (option == 1) {
            System.out.println(first + " + " + second + " = " + (first + second));
        }
        else if (option == 2) {
            System.out.println(first + " - " + second + " = " + (first - second));
        }
        else if (option == 3) {
            System.out.println(first + " * " + second + " = " + (first * second));
        }
        else if (option == 4) {
            System.out.println(first + " / " + second + " = " + (first / second));
        }
        else {
            System.out.println("Invalid input.");
        }

    }
    static double acceptDouble(String message) {
        System.out.println(message);
        double answer;
        String input;
        Scanner scanner = new Scanner(System.in);
        while(true) {
            input = scanner.nextLine();
            try{
                // break once we've found the correct answer:
                answer = Double.parseDouble(input);
                break;
            }
            catch (Exception e) {
                System.out.println("Please enter a double.");
                continue;
            }
        }
        return answer;
    }

    static int acceptInt(String message) {
        System.out.println(message);
        int answer;
        String input;
        Scanner scanner = new Scanner(System.in);
        while(true) {
            input = scanner.nextLine();
            try{
                // break once we've found the correct answer:
                answer = Integer.parseInt(input);
                break;
            }
            catch (Exception e) {
                System.out.println("Please enter an integer.");
                continue;
            }
        }
        return answer;
    }
}
