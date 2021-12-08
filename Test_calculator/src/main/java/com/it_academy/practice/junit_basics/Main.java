package com.it_academy.practice.junit_basics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NumberFormatException, ArithmeticException {

        Scanner sc = new Scanner(System.in);

        int n1 = Integer.parseInt(sc.next());
        int n2 = Integer.parseInt(sc.next());

        Calculator calc1 = new Calculator(n1, n2);


        calc1.exponentiationMethod ();
        calc1.squareRootMethod();
        calc1.typingMethod();


//
//        Calculator calculator = new Calculator(n1, n2);
//
//        System.out.println("Plus result: " + calculator.calculate('+'));
//        System.out.println("Minus result: " + calculator.calculate('-'));
//        System.out.println("Division result: " + calculator.calculate('/'));
//        System.out.println("Multiply result: " + calculator.calculate('*'));
    }
}
