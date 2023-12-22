import java.util.Scanner;
public class TestAutor {
    public static void test_autor() {
        Scanner sc = new Scanner(System.in);
        Autor aut = new Autor("Ivan", "ivan@mail.com", 'm');
        int x;
        System.out.println("1 - output name");
        System.out.println("2 - output email");
        System.out.println("3 - output gender");
        System.out.println("4 - change email");
        System.out.println("5 - output info");
        System.out.println("0 - exit");
        do {
            x = sc.nextInt();
            sc.nextLine();
            switch(x) {
                case(1) -> System.out.println("Name is " + aut.getName());
                case(2) -> System.out.println("Email is " + aut.getEmail());
                case(3) -> {
                    x = aut.getGender();
                    if (x == 'm') System.out.println("Gender is man");
                    else if (x == 'w') System.out.println("Gender is woman");
                    break;
                }
                case(4) -> {
                    String line = sc.nextLine();
                    aut.setEmail(line);
                }
                case(5) -> System.out.println(aut);
            }
        } while (x != 0);
    }
}