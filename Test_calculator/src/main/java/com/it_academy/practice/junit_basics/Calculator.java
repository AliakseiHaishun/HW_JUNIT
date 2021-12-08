package com.it_academy.practice.junit_basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {

    private int a;
    private int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public float getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public float calculate(char operation) {
        switch (operation) {
            default: {
                return 0;
            }
            case '-': {
                return a - b;
            }
            case '+': {
                return a + b;
            }
            case '/': {
                return a / b;
            }
            case '*': {
                return a * b;
            }
        }
    }


    public void typingMethod() {
        System.out.println("Введите цифру формата int, После введите Stop");
        Scanner in = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (true) {
            try {
                if (in.hasNext("Stop")) {
                    int sum = 0;
                    System.out.println("Введенные числа: " + list);

                    for (int i = 0; i < list.size(); i++) {
                        sum += list.get(i);
                    }
                    System.out.println("Сумма введенных чисел: " + sum);

                    int subtraction = list.get(0);
                    for (int i = 1; i < list.size(); i++) {
                        subtraction -= list.get(i);
                    }
                    System.out.println("Разность введенных чисел: " + subtraction);

                    int multiplication = list.get(0);
                    for (int i = 1; i < list.size(); i++) {
                        multiplication *= list.get(i);
                    }
                    System.out.println("Произведение введенных чисел: " + multiplication);

                    float dividing = list.get(0);
                    for (int i = 1; i < list.size(); i++) {
                        dividing /= list.get(i);
                    }
                    System.out.println("Частное введенных чисел: " + dividing);
                    break;
                }
                if (!in.hasNextInt()) {
                    System.out.println("Введите цифру");
                    in.next();
                } else {
                    list.add(in.nextInt());
                }
            } catch (Exception e) {
            }
        }
    }

    public float exponentiationMethod() {
        float res = (float) Math.pow(a, b);
        System.out.println("Число " + a + " в степени " + b + " = " + res);
        return res;
    }

    public Object squareRootMethod() {
        float res = (float) Math.sqrt(a);
        System.out.println("Кв. корень числа " + a + " = " + res);
        return res;
    }
}


