package com.company.Week2.Day2;

// Create an abstract class 'Bank' with an abstract method 'getBalance'.
// $100, $150 and $200 are deposited in banks A, B and C respectively. 'BankA',
// 'BankB' and 'BankC' are subclasses of class 'Bank', each having a method named 'getBalance'.
// Call this method by creating an object of each of the three classes.

abstract class Bank {
    abstract int getBalance();
}

class BankA extends Bank {

    @Override
    int getBalance() {
        return 100;
    }
}

class BankB extends Bank {

    @Override
    int getBalance() {
        return 150;
    }
}

class BankC extends Bank {

    @Override
    int getBalance() {
        return 200;
    }
}

public class Challenge5 {
    public static void main(String[] args) {
        BankA a = new BankA();
        BankB b = new BankB();
        BankC c = new BankC();

        System.out.println("Bank a: "  + a.getBalance());
        System.out.println("Bank b: " + b.getBalance());
        System.out.println("Bank c: " + c.getBalance());
    }

}
