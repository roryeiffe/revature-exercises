package com.company.Week1;

import java.util.HashSet;
import java.util.LinkedList;

public class HashSetQuestions {

    public static void main(String[] args) {
        c1();
        c2();
        c3();
        c4();
    }

    //Write a Java program to append the specified element to the end of a hash set.
    public static void c1() {
        HashSet<String> names = getNames();
        names.add("Rory");
        System.out.println(names);
    }
    // Write a Java program to iterate through all elements in a hash list.
    public static void c2() {
        HashSet<String> names = getNames();
        for(String name: names) {
            System.out.println(name);
        }
    }
    // Write a Java program to get the number of elements in a hash set
    public static void c3() {
        HashSet<String> names = getNames();
        System.out.println(names.size());
    }

    // Write a Java program to empty an hash set.
    public static void c4() {
        HashSet<String> names = getNames();
        names.removeAll(names);
        System.out.println(names);
    }

    public static HashSet<String> getNames() {
        HashSet<String> names = new HashSet<>();
        names.add("Tony");
        names.add("Steve");
        names.add("Thor");
        names.add("Clint");
        names.add("Natasha");
        names.add("Bruce");
        names.add("Peter");
        names.add("Vision");
        names.add("Ned");
        names.add("Star-Lord");
        names.add("Drax");
        names.add("Scott");
        names.add("Thanos");
        names.add("Loki");
        return names;
    }
}
