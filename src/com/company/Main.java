package com.company;

public class Main {

    public static void main(String[] args) {
        byte apples = 9;
        System.out.println("Яблок " + apples);

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
        int sumEat = bananas + milk + iceCream + eggs;
        double kg = sumEat * 0.001;
        System.out.println(kg);

        int gram = 7*1000;
        int diet1 = gram/250;
        int diet2 = gram/500;
        int optimal = (diet1 + diet2)/2;
        System.out.println(optimal + " день в среднем потребуется для похудения");

        double MashaPrize = 67760 * 0.10;
        double Masha = 67760 + MashaPrize;
        System.out.println(Masha + " Маша будет получать в месяц после премии");
        double year = 67760 * 12;
        double future = Masha * 12;
        double difference = future - year;
        System.out.println(difference + " разница между годовым доходом Маши с нынешней зарплатой и после повышения");

        double DenisPrize = 83690 * 0.10;
        double Denis = 83690 + DenisPrize;
        System.out.println(Denis + " Денис будет получать в месяц после премии");
        double year1 = 83690 * 12;
        double future1 = Denis * 12;
        double difference1 = future1 - year1;
        System.out.println(difference1 + " разница между годовым доходом Дениса с нынешней зарплатой и после повышения");

        double KristinaPrize = 76230 * 0.10;
        double Kristina = 76230 + KristinaPrize;
        System.out.println(Kristina + " Кристина будет получать в месяц после премии");
        double year2 = 76230 * 12;
        double future2 = Kristina * 12;
        double difference2 = future2 - year2;
        System.out.println(difference2 + " разница между годовым доходом Кристины с нынешней зарплатой и после повышения");
    }
}
