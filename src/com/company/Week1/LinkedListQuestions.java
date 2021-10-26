package com.company.Week1;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListQuestions {

    public static void main(String[] args) {
         c1();
         c2();
        c3();
        c4();
            c5();
    }

    // Write a Java program to append the specified element to the end of a linked list.
    public static void c1() {
        // Challenge 1:
        LinkedList<String> names = getNames();
        // before:
        System.out.println(names);

        // append:
        names.add("Rory");

        // after:
        System.out.println(names);

        // Challenge 2:
    }
    // Write a Java program to iterate through all elements in a linked list.
    public static void c2() {
        LinkedList<String> names = getNames();
        // method 1:
        for(String name : names) {
            System.out.println(name);
        }
        // method 2:
        Iterator<String> itr = names.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        // method 3:
        names.forEach(name -> {
            System.out.println(name);
        });
    }
    // Write a Java program to iterate through all elements in a linked list starting at the specified position.
    public static void c3() {
        LinkedList<String> names = getNames();
        // Specified position:
        int start = 5;

        String startingName = names.get(start-1);
        System.out.println();

        // get to the specified spot:
        Iterator<String> itr = names.iterator();
        while(itr.hasNext()) {
            if (itr.next().equals(startingName)) {
                break;
            }
        }
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    // Write a Java program to iterate a linked list in reverse order.
    public static void c4() {
        LinkedList<String> names = getNames();
        Iterator<String> itr = names.descendingIterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    // Write a Java program to insert the specified element at the specified position in the linked list.
    public static void c5() {
        LinkedList<String> names = getNames();

        int pos = 6;
        String element = "Barry";
        names.add(6,element);
        System.out.println(names);
    }

    public static LinkedList<String> getNames() {
        LinkedList<String> names = new LinkedList<>();
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
