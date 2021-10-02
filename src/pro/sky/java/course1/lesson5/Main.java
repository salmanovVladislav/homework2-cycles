package pro.sky.java.course1.lesson5;

public class Main {
        public static void main(String[] args) {
                basictasks();
        }

        private static void basictasks() {
                String firstName = "Ivan";
                String middleName = "Ivanovich";
                String lastName = "Ivanov";
                String fullName = lastName + " " + firstName + " " + middleName;
                System.out.println("ФИО сотрудника - " + fullName);

                String fullNameForReport = fullName.toUpperCase();
                System.out.println("Данные ФИО сотрудника для заполнения отчета – " + fullNameForReport);

                String fullNameForPasses = fullName.replace(" ", ";");
                System.out.println("Данные ФИО сотрудника для административного отдела - " + fullNameForPasses);

                String[] fullName2 = fullName.split(" ");
                fullName2[0] = "Иванов";
                fullName2[1] = "Семён";
                fullName2[2] = "Семёнович";
                String fullName3 = fullName2[0] + " " + fullName2[1] + " " + fullName2[2];
                String fullName4 = fullName3.replace('ё', 'е');
                System.out.println(fullName4);
        }
}
