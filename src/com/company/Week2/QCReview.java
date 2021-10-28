package com.company.Week2;

class TestClass extends QCReview{
    int x;

    public TestClass(int x) {
        this.x = x;
    }


    public static void main(String[] args) {
        System.out.println("Hello override.");
    }
}

public class QCReview {
    public static void main(String[] args) {
        boolean b;
        char c;
        byte bb;
        short s;
        int i;
        long l;
        float f;
        double d;

        TestClass t = new TestClass(3);
        System.out.println(t.x);
        change(t);
        System.out.println(t.x);

        int x = 1;
        String [] args2 = {"hello"};
        main(args2,1);
        t.main(args2);

       

//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(bb);
//        System.out.println(s);
//        System.out.println(i);
//        System.out.println(l);
//        System.out.println(f);
//        System.out.println(d);

    }

    public static void main (String [] args, int x) {
        System.out.println("hello");
    }

    public static void change (TestClass t) {
        t.x = 5;
        return;
    }
}
