package com.company.Week2.Day2;

/**
 * We have to calculate the percentage of marks
 * obtained in three subjects (each out of 100)
 * by student A and in four subjects (each out of 100)
 * by student B. Create an abstract class 'Marks' with
 * an abstract method 'getPercentage'. It is inherited by
 * two other classes 'A' and 'B' each having a method with
 * the same name which returns the percentage of the students.
 * The constructor of student A takes the marks in three subjects
 * as its parameters and the marks in four subjects as its parameters
 * for student B. Create an object for eac of the two classes and print
 * the percentage of marks for both the students.
 */

// abstract class that will be inherited by each class:
abstract class Marks {
    abstract double getPercentage();
}

class A extends Marks {
    double m1,m2,m3;

    // constructor that takes 3 marks:
    public A(double m1, double m2, double m3) {
        this.m1 = m2;
        this.m2 = m3;
        this.m3 = m3;
    }

    // return the average:
    @Override
    double getPercentage() {
        return (m1 + m2 + m3) / 3;
    }
}

// Class B is similar to A except that is accepts 4 marks:
class B extends Marks {
    double m1,m2,m3,m4;

    public B(double m1, double m2, double m3, double m4) {
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.m4 = m4;
    }

    @Override
    double getPercentage() {
        return (m1 + m2 + m3 + m4) / 4;
    }
}

public class Challenge4 {
    public static void main(String[] args) {
        // Create some students and test the methods:
        A student1 = new A(100,95,90);
        B student2 = new B(75,81,60,68);
        System.out.println("A percent: " + student1.getPercentage());
        System.out.println("B percent: " + student2.getPercentage());
    }

}
