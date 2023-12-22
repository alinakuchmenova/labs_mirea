import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of exercise (from 1 to 5)");
        int ex = sc.nextInt();
        switch (ex) {
            case (1) -> {
                System.out.println("Enter the length of the array");
                int len = sc.nextInt();
                int[] arr = new int[len];
                System.out.println("Enter array elements");
                for (int x = 0; x < len; x++) arr[x] = sc.nextInt();
                int sum = 0;
                for (int x = 0; x < len; x++) sum += arr[x];
                float average = (float) sum / len;
                System.out.println("Sum of array elements: " + sum);
                System.out.print("Average of array elements: " + average);
            }
            case (2) -> {
                System.out.println("Enter the length of the array");
                int len = sc.nextInt();
                int[] arr = new int[len];
                System.out.println("Enter array elements");
                int x = 0;
                do {
                    arr[x] = sc.nextInt();
                    x++;
                } while (x < len);
                x = 0;
                int sum = 0, max = 0, min = arr[0];
                while (x < len) {
                    sum += arr[x];
                    if (max < arr[x]) max = arr[x];
                    if (min > arr[x]) min = arr[x];
                    x++;
                }
                System.out.println("Sum of array elements: " + sum);
                System.out.println("Minimum element: " + max);
                System.out.print("Minimum element: " + min);
            }
            case (3) -> {
                for (String line : args) System.out.println(line);
            }
            case (4) -> {
                int amount = 10;
                for (float x = 1; x <= amount; x++){
                    System.out.print(1 / x);
                    if (x < amount) System.out.print(", ");
                }
            }
            case (5) -> {
                System.out.println("Enter number");
                int num = sc.nextInt();
                System.out.print("Factorial is " + factorial(num));
            }
        }
    }

    public static int factorial (int num){
        int f = 1;
        while (num != 0) {
            f *= num;
            num--;
        }
        return f;
    }
}