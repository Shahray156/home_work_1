package com.company;

public class Main {

    public static void main(String[] args) {
        byte apples = 95;
        System.out.println("Яблок " + apples + " кг");

        short bananas = 212;
        System.out.println("Бананов " + bananas + " кг");

        int age = 45;
        System.out.println(age);

        long a = 200000L;
        System.out.println(a);

        float f = 156.7f;
        System.out.println(f);

        double d = 566.1;
        System.out.println(d);

        float bodyMass1 = 78.2f;
        float bodyMass2 = 82.7f;
        float sum = bodyMass1 + bodyMass2;
        float result = bodyMass2 - bodyMass1;
        System.out.println(sum);
        System.out.println(result);
    }
}
