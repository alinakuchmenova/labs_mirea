import java.util.Objects;

public class Person {
    String surname;
    String name;
    String fathername;
    public Person(String surname, String name, String fathername) {
        this.surname = surname;
        this.name = name;
        this.fathername = fathername;
    }
    public Person(String surname, String name) {
        this.surname = surname;
        this.name = name;
        fathername = "";
    }
    public Person(String surname) {
        this.surname = surname;
        name = "";
        fathername = "";
    }
    @Override
    public String toString() {
        StringBuilder fullname = new StringBuilder(surname);
        if(!Objects.equals(name, ""))fullname.append(" ").append(name.charAt(0)).append(".");
        if(!Objects.equals(fathername, ""))fullname.append(" ").append(fathername.charAt(0)).append(".");
        return fullname.toString();
    }
}
