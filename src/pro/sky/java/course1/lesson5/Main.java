package pro.sky.java.course1.lesson5;

public class Main {
        public static void main(String[] args) {
                task1();
                task2();
                task3();
                task4();
        }

        private static void task1() {
                String fullName = "Ivanov Ivan Ivanovich";
                System.out.println("ФИО сотрудника - " + fullName);
        }

        private static void task2() {
                String fullName = "Ivanov Ivan Ivanovich";
                String fullNameForReport = fullName.toUpperCase();
                System.out.println("Данные ФИО сотрудника для заполнения отчета – " + fullNameForReport);
        }

        public static void task3() {
                String fullName = "Ivanov Ivan Ivanovich";
                String fullNameForPasses = fullName.replace(" ", ";");
                System.out.println("Данные ФИО сотрудника для административного отдела - " + fullNameForPasses);
        }

        public static void task4() {
                String fullName = "Иванов Семён Семёнович";
                String fullName2 = fullName.replace('ё', 'е');
                System.out.println("Данные ФИО сотрудника - " + fullName2);
        }
}
