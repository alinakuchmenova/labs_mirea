public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Ivanov", "Ivan", "Ivanovich");
        Person person2 = new Person("Ivanov", "Ivan");
        Person person3 = new Person("Ivanov", "", "Ivanovich");
        Person person4 = new Person("Ivanov");
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
    }
}