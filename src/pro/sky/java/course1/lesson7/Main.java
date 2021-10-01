package pro.sky.java.course1.lesson7;

public class Main {

    public static void main(String[] args) {
        Author tolstoy = new Author("Лев", "Толстой", "Николаевич");
        Author dostoevsky = new Author("Федор", "Достоевский", "Михайлович");
        Book warAndPeace = new Book("Война и мир", tolstoy, 1867);
        Book triumphalArch = new Book("Идиот", dostoevsky, 1869);

        System.out.println("Название произведения - " + warAndPeace.getName());
        System.out.println("Автор - " + warAndPeace.author.getSurname());
        System.out.println("Год побуликации - " + warAndPeace.getPublishingYear());
        System.out.println("Название произведения - " + triumphalArch.getName());
        System.out.println("Автор - " + triumphalArch.author.getSurname());
        System.out.println("Год публикации - " + triumphalArch.getPublishingYear());
        warAndPeace.setPublishingYear(2010);
        System.out.println("Измененный год публикации Войны и мир - " + warAndPeace.getPublishingYear());
    }
}
