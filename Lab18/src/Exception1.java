
/*
public class Exception1 {
    public void exceptionDemo() {
        System.out.println(2 / 0);
    }

    public static void main(String[] args) {
        Exception1 demo = new Exception1();
        demo.exceptionDemo();
    }
}
*/

//Этот код вызывает деление на ноль без обработки исключения.
//Это приведет к ArithmeticException и завершению программы с сообщением об ошибке деления на ноль.

/*
public class Exception1 {
    public void exceptionDemo() {
        System.out.println(2.0 / 0.0);
    }

    public static void main(String[] args) {
        Exception1 demo = new Exception1();
        demo.exceptionDemo();
    }
}
//Здесь деление происходит с использованием чисел с плавающей запятой, что приведет
//к получению Infinity или NaN в зависимости от специфики операции. Также, как и в шаге 1, нет обработки исключения.
*/
/*
public class Exception1 {
    public void exceptionDemo() {
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
    }

    public static void main(String[] args) {
        Exception1 demo = new Exception1();
        demo.exceptionDemo();
    }
}
//Этот код использует блок try-catch для обработки ArithmeticException, возникающего при делении на ноль.
// Если такое деление происходит, программа выводит сообщение "Attempted division by zero"
//вместо вызова исключения и завершения работы программы.
*/