import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String word;
        System.out.println("Enter number of elements");
        int len = sc.nextInt();
        sc.nextLine();
        for(int x = 0; x < len; x++){
            list.add(sc.nextLine());
        }
        for (int x = 0; x < len/2; x++){
            word = list.get(x);
            list.set(x, list.get(len - 1 - x));
            list.set(len - 1 - x, word);
        }
        System.out.println("Reversed array");
        for (int x =0; x < len; x++){
            System.out.println(list.get(x));
        }
    }
}