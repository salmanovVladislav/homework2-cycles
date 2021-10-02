package pro.sky.java.course1.lesson6;

import java.time.LocalDate;
import java.util.Arrays;

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


    }

    private static void task4() {
        deleteDuplicates("abccdefghhijk");
    }

    private static void task5() {
        moveItems(new int[]{3, 2, 1, 6, 5});
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
        int daysCount = 1;
        if (distance > 20) {
            daysCount += 1;
        }
        if (distance > 60) {
            daysCount += 1;
        }
        return daysCount;

    }

    //Метод к task4.
    public static void deleteDuplicates(String duplicates) {
        char[] chars = duplicates.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == chars[i + 1]) {
                System.out.println("Символ " + "'" + chars[i] + "'" + " дублируется");
                break;
            }
        }
    }

    //Метод к task5.
    private static void moveItems(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[size - 1 - i];
            arr[size - 1 - i] = temp;
        }
        System.out.println("Массив после раверса" + Arrays.toString(arr));
    }
}