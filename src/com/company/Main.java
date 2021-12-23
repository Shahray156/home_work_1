package com.company;

public class Main {

    public static void main(String[] args) {
        byte apples = 95;
        System.out.println("Яблок " + apples + " кг");

        short pear = 212;
        System.out.println("Груш " + pear + " кг");

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

        int bananas = 5 * 80;
        int milk = (200/100) * 105;
        int iceCream = 2 * 100;
        int eggs = 4 * 70;
        int eat = bananas + milk + iceCream + eggs;
        System.out.println("Общий вес завтрака " + (bananas + milk + iceCream + eggs) * 0.001 + "кг");

        int gram = 7*1000;
        int diet1 = gram/250;
        int diet2 = gram/500;
        int optimal = (diet1 + diet2)/2;
        System.out.println(optimal + " день в среднем потребуется для похудения");
    }
}
