import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int ex;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter number of exercise (from 1 to 10), 0 for exit");
            ex = sc.nextInt();
            switch (ex) {
                case 1 -> TestAutor.test_autor();
                case 2 -> TestBall.test_ball();
            }
        } while (ex != 0);
    }
}