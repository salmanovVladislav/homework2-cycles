package pro.sky.java.course1.lesson7;

public class Author {
    private final String name;
    private final String surname;
    private final String lastname;

    public Author(String name, String surname, String lastname) {
        this.name = name;
        this.surname = surname;
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getLastname() {
        return lastname;
    }
}
