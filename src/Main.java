public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        System.out.println(" Задача 1 ");
        int total = 0;
        int capital = 15000;
        int month = 1;
        while (total <= 2_459_000) {
            total = total + capital;
            System.out.println(" Месяц " + month + " , сумма накоплений равна " + total + " рублей ");
            month++;
        }
        task2();
    }

    public static void task2() {
        System.out.println(" Задача 2 ");
        int start = 1;
        while (start <= 10) {
            System.out.print(start + " ");
            start = start + 1;
        }
        System.out.println();
        for (int i = 10; i >= 1; i = i - 1) {
            System.out.print(i + " ");
        }
        System.out.println();
        task3();
    }

    public static void task3() {
        System.out.println(" Задача 3 ");
        int totalPopulation = 12_000_000;
        int fertility = totalPopulation * 17 / 1000;
        int mortality = totalPopulation * 8 / 1000;
        for (int year = 1; year <= 10; year++) {
            totalPopulation = totalPopulation + fertility - mortality;
            System.out.println("Год " + year + ", численность населения составляет " + totalPopulation);
        }
        task4();
    }

    public static void task4() {
        System.out.println(" Задача 4 ");
        double capital = 15000;
        int month = 1;
        while (capital <= 12_000_000) {
            capital = capital + capital * 7 / 100;
            System.out.println(" Месяц " + month + " , сумма накоплений равна " + capital + " рублей ");
            month++;
        }
        task5();
    }

    public static void task5() {
        System.out.println(" Задача 5 ");
        double capital = 15000;
        int month = 1;
        while (capital <= 12_000_000) {
            capital = capital + capital * 7 / 100;
            if (month % 6 == 0) {
                System.out.println(" Месяц " + month + " , сумма накоплений равна " + capital + " рублей ");
            }
            month++;
        }
        task6();
    }

    public static void task6() {
        System.out.println(" Задача 6 ");
        double capital = 15000;
        for (int i = 1; i <= 9 * 12; i++) {
            capital = capital + capital * 7 / 100;
            if (i % 6 == 0) {
                System.out.println(" Месяц " + i + " , сумма накоплений равна " + capital + " рублей ");
            }
        }
        task7();
    }

    public static void task7() {
        System.out.println(" Задача 7 ");
        int i = 5;
        for (; i <= 31; i = i + 7) {
            System.out.println(" Сегодня пятница, " + i + " -е число. Необходимо подготовить отчет ");
        }
        task8();
    }

    public static void task8() {
        System.out.println(" Задача 8 ");
        int yearNow = 2023;
        int y = yearNow - 200;
        int z = yearNow + 100;
        for (int year = y; year <= z; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }
    }
}











