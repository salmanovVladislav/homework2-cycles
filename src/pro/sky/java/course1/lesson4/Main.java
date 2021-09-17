package pro.sky.java.course1.lesson4;

public class Main {
    public static void main(String[] args) {
        basicTasks();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    private static void basicTasks() {
        int[] arr = generateRandomArray();
        int[] days = new int[30];
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

        int minSpending = 200_000;
        for (int q : arr) {
            if (q < minSpending) {
                minSpending = q;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSpending + " рублей");
        int maxSpending = 100_000;
        for (int j : arr) {
            if (j > maxSpending) {
                maxSpending = j;
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxSpending + " рублей");
        float averageSum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += days[i];
            for (int element : arr) {
                sum += element;
            }
            averageSum = sum / days.length;
        }
        System.out.println("Средняя сумма трат за месяц составила " + averageSum + " рублей");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
