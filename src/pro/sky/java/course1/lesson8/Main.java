package pro.sky.java.course1.lesson8;

public class Main {
    public static void main(String[] args) {
        Author tolstoy = new Author("Лев", "Толстой", "Николаевич");
        Author dostoevsky = new Author("Федор", "Достоевский", "Михайлович");
        Book warAndPeace = new Book("Война и мир", tolstoy, 1867);
        Book triumphalArch = new Book("Идиот", dostoevsky, 1869);

        //вызываем метод toString из класса Author и сравниваем объекты с помощью метода equals
        System.out.println(tolstoy);
        System.out.println(dostoevsky);
        System.out.println("Эти два объекта равны друг другу?: " + tolstoy.equals(dostoevsky));

        //вызываем метод toString из класса Book и сравниваем объекты с помощью метода equals
        System.out.println(warAndPeace);
        System.out.println(triumphalArch);
        System.out.println("Эти два объекта равны друг другу?: " + warAndPeace.equals(triumphalArch));

        System.out.println("Хэш-коды у созданных объектов:");
        System.out.println(tolstoy.hashCode());
        System.out.println(dostoevsky.hashCode());
        System.out.println(warAndPeace.hashCode());
        System.out.println(triumphalArch.hashCode());
    }
}