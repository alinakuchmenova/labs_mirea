import java.util.Scanner;
public class HowMany {
    public HowMany() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence");
        String line = sc.nextLine();
        int num = 0;
        boolean swt = true;
        for (int x = 0; x < line.length(); x++){
            if(line.charAt(x) == ' '){
                swt = true;
            }
            else if(swt){
                swt = false;
                num++;
            }
        }
        System.out.println("Number of words: " + num);
    }
}
