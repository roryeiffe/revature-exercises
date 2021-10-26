package com.company.Week1;

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetQuestions {

    public static void main(String[] args) {
        c1();
        c2();
        c3();
        c4();
        c5();
    }



    // Write a Java program to create a new tree set, add some colors (string) and print out the tree set.
    public static void c1() {
        TreeSet<String> colors = new TreeSet<String>();
        colors.add("blue");
        colors.add("green");
        colors.add("red");
        colors.add("white");
        colors.add("pink");
        colors.add("black");

        System.out.println(colors);

    }

    // Write a Java program to iterate through all elements in a tree set.
    public static void c2() {
        TreeSet<String> names = getNames();
        for(String name: names) {
            System.out.println(name);
        }
    }

    // Write a Java program to add all the elements of a specified tree set to another tree set.
    public static void c3() {
        TreeSet<String> colors = new TreeSet<String>();
        colors.add("blue");
        colors.add("green");
        colors.add("red");
        colors.add("white");
        colors.add("pink");
        colors.add("black");

        TreeSet<String> names = getNames();
        names.addAll(colors);
        System.out.println(names);
    }

    // Write a Java program to create a reverse order view of the elements contained in a given tree set.
    public static void c4() {
        TreeSet<String> names = getNames();
        Iterator<String> itr = names.descendingIterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    // Write a Java program to get the first and last elements in a tree set
    public static void c5() {
        TreeSet<String> names = getNames();
        System.out.println(names.first());
        System.out.println(names.last());
    }


    public static TreeSet<String> getNames() {
        TreeSet<String> names = new TreeSet<>();
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
