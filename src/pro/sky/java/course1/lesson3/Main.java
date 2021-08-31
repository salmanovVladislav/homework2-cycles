package pro.sky.java.course1.lesson3;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    private static void task1() {
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(" " + i);
        }
        System.out.print("\n");
        for (int a = 10; a >= 1; a--)
            System.out.print(" " + a);
        System.out.println();
    }

    private static void task2() {
        boolean isTrue = true;
        int firstFriday = 6;
        while (isTrue) {
            firstFriday += 7;
            if (firstFriday > 31)
                isTrue = false;
            System.out.println("Сегодня пятница, " + firstFriday + "-ое число. Необходимо подготовить отчет.");
        }
    }

    private static void task3() {
        int thisYear = 2021;
        int differenceOfYearsBefore = 200;
        int differenceOfYearsAfter = 100;
        int yearBefore = thisYear - differenceOfYearsBefore;
        int yearAfter = thisYear + differenceOfYearsAfter;
        for (int year = yearBefore; year <= yearAfter; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }

        }
    }

    private static void task4() {
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " - ping pong");
            } else if (i % 5 == 0) {
                System.out.println(i + " - pong");
            } else if (i % 3 == 0) {
                System.out.println(i + " - ping");
            } else {
                System.out.println(i);
            }
        }
    }

    private static void task5() {
        int f1 = 0;
        int f2 = 1;
        int f3;
        System.out.print(f1 + " " + f2 + " ");
        for (int i = 1; i <= 8; i++) {
            f3 = f1 + f2;
            System.out.print(f3 + " ");
            f1 = f2;
            f2 = f3;
        }
    }
}




















