package pro.sky.java.course1.lesson5;

public class Main {
        public static void main(String[] args) {
                task1();
                task2();
                task3();
                task4();
        }

        private static void task1() {
                String firstName = "Ivan";
                String middleName = "Ivanovich";
                String lastName = "Ivanov";
                String fullName = lastName + " " + firstName + " " + middleName;
                System.out.println("ФИО сотрудника - " + fullName);
        }

        private static void task2() {
                String firstName = "Ivan";
                String middleName = "Ivanovich";
                String lastName = "Ivanov";
                String fullName = lastName + " " + firstName + " " + middleName;
                String fullNameForReport = fullName.toUpperCase();
                System.out.println("Данные ФИО сотрудника для заполнения отчета – " + fullNameForReport);
        }

        public static void task3() {
                String firstName = "Ivan";
                String middleName = "Ivanovich";
                String lastName = "Ivanov";
                String fullName = lastName + " " + firstName + " " + middleName;
                String fullNameForPasses = fullName.replace(" ", ";");
                System.out.println("Данные ФИО сотрудника для административного отдела - " + fullNameForPasses);
        }

        public static void task4() {
                String firstName = "Иванов";
                String middleName = "Семён";
                String lastName = "Семёнович";
                String fullName = firstName + " " + middleName + " " + lastName;
                String fullName2 = fullName.replace('ё', 'е');
                System.out.println("Данные ФИО сотрудника - " + fullName2);
                //судя по всему, я не понял условие задачи..подсказки, которые даны в задаче (метод
                //split и метод contains) не придумал как применить.
        }
}
