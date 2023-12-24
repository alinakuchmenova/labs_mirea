//все по тз
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, id;
        String name;
        Shop shop = new Shop();
        do {
            System.out.println("Enter 1 for adding computer");
            System.out.println("Enter 2 for removing computer");
            System.out.println("Enter 3 for finding computer");
            System.out.println("Enter 0 for exit");
            x = sc.nextInt();
            if(x==1) {
                System.out.println("Enter id of computer");
                id = sc.nextInt();
                System.out.println("Enter name of computer");
                sc.nextLine();
                name = sc.nextLine();
                shop.addComputer(id, name);
            }
            if(x==2) {
                System.out.println("Enter id of computer");
                id = sc.nextInt();
                shop.removeComputer(id);
            }
            if(x==3) {
                System.out.println("Enter id of computer");
                id = sc.nextInt();
                System.out.println(shop.findComputer(id));
            }
        } while (x!=0);
    }
}