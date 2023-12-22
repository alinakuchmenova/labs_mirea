
import java.util.Scanner;

/*public class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString);
        System.out.println(2 / i);
    }

    public static void main(String[] args) {
        Exception2 demo = new Exception2();
        demo.exceptionDemo();
    }
}
*/
//NumberFormatException: возникает при попытке преобразования некорректной строки в целое число с помощью Integer.parseInt().
//ArithmeticException: возникает при попытке деления на ноль (2 / 0).

/*
public class Exception2 {
    public void exceptionDemo() {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer: ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Invalid input");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Attempted division by zero");
        }
    }

    public static void main(String[] args) {
        Exception2 demo = new Exception2();
        demo.exceptionDemo();
    }
}
*/
//Этот код добавляет блоки try-catch для обработки NumberFormatException (при вводе некорректной строки)и
// ArithmeticException (при делении на ноль). При возникновении этих исключений программа выводит соответствующие сообщения об ошибке,
//что позволяет избежать краша программы и обеспечивает более плавное выполнение.

/*
public class Exception2 {
    public void exceptionDemo() {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer: ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Invalid input");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Attempted division by zero");
        } catch (Exception e) {
            System.out.println("General Exception: Something went wrong");
        }
    }

    public static void main(String[] args) {
        Exception2 demo = new Exception2();
        demo.exceptionDemo();
    }
}
*/

public class Exception2 {
    public void exceptionDemo() {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer: ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Invalid input");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Attempted division by zero");
        } finally {
            System.out.println("Finally block executed");
        }
    }

    public static void main(String[] args) {
        Exception2 demo = new Exception2();
        demo.exceptionDemo();
    }
}
