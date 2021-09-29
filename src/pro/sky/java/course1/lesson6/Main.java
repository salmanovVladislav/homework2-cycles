package pro.sky.java.course1.lesson6;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    private static void task1() {
        leapYear(2020);
    }

    private static void task2() {
        telephone(1, 2021);
    }

    private static void task3() {
        numberDays(95);
        System.out.println(numberDays(95));
    }

    private static void task4() {
        deleteDuplicates();
    }

    private static void task5() {
        moveItems();
    }

    //Метод к task1.
    private static void leapYear(int year) {
        if ((year % 4 == 0) && ((year % 100 != 0) || year % 400 == 0)) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
    }

    //Метод к task2.
    public static void telephone(int clientOS, int clientDeviceYear) {
        String osName = clientOS == 0 ? "Android" : "iOS";
        int currentYear = LocalDate.now().getYear();
        boolean liteVersion = clientDeviceYear < currentYear;
        String version = liteVersion ? "lite-версию" : "версию";
        System.out.println("Установите " + version + " приложения для " + osName + " по ссылке");
    }

    //Метод к task3.
    public static int numberDays(int distance) {
        if (distance < 20) {
            return 1;
        } else if (distance > 20 && distance < 60) {
            return 2;
        } else if (distance > 60 && distance < 100) {
            return 3;
        }
        return numberDays(95);

    }

    //Метод к task4.
    public static void deleteDuplicates() {
        String a = "abccdefghhijk";
        char[] chars = a.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == chars[i + 1]) {
                System.out.println("Символ " + "'" + chars[i] + "'" + " дублируется");
                break;
            }
        }
    }

    //Метод к task5.
    private static void moveItems() {
        int[] arr = {3, 2, 1, 6, 5};
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}