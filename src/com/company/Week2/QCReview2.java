package com.company.Week2;

interface I1 {
    default void print() {
        System.out.println("hello");
    }

    default void print(int x) {
        System.out.println(x);
    }
}

public class QCReview2 {

    public static void main(String[] args) {

    }
}
