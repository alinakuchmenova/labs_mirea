import java.util.Scanner;
public class TestBall {
    public static void test_ball() {
        Scanner sc = new Scanner(System.in);
        Ball ball = new Ball(11, 12);
        int x;
        float posX, posY;
        System.out.println("1 - output x");
        System.out.println("2 - output y");
        System.out.println("3 - set x");
        System.out.println("4 - set y");
        System.out.println("5 - set x and y");
        System.out.println("6 - move x and y");
        System.out.println("7 - output position");
        System.out.println("0 - exit");
        do {
            x = sc.nextInt();
            sc.nextLine();
            switch(x) {
                case(1) -> System.out.println("X is " + ball.getX());
                case(2) -> System.out.println("Y is " + ball.getY());
                case(3) -> {
                    posX = sc.nextFloat();
                    ball.setX(posX);
                }
                case(4) -> {
                    posY = sc.nextFloat();
                    ball.setY(posY);
                }
                case(5) -> {
                    posX = sc.nextFloat();
                    posY = sc.nextFloat();
                    ball.setXY(posX, posY);
                }
                case(6) -> {
                    posX = sc.nextFloat();
                    posY = sc.nextFloat();
                    ball.move(posX, posY);
                }
                case(7) -> System.out.println(ball);
            }
        } while (x != 0);
    }
}