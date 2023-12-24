import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class Poker {
    public Poker (){
        Random random = new Random( System.nanoTime());
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of players");
        int num = sc.nextInt();
        if (num > 10) System.out.println("Too many players");
        else{
            ArrayList<Integer> cards = new ArrayList<>();
            for (int x = 0; x < 52; x++){
                cards.add(x%13+1);
            }
            for(int x = 0; x < num; x ++){
                for(int y = 0; y < 5; y++){
                    int rand = random.nextInt(cards.size());
                    int card = cards.get(rand);
                    cards.remove(rand);
                    if(card == 1)System.out.print("T ");
                    else if(card == 11)System.out.print("V ");
                    else if(card == 12)System.out.print("Q ");
                    else if(card == 13)System.out.print("K ");
                    else System.out.print(card + " ");
                }
                System.out.println();
            }
        }
    }
}
