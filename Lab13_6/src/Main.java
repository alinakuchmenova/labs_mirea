import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String path;
        Scanner scan = new Scanner(System.in);
        int number = Integer.valueOf(scan.nextLine());
        if(args.length==0){
            path = "";
        }
        else {
            path = args[0];
        }
        try {
            ArrayList<String> words = new ArrayList<>();
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line = reader.readLine();
            while (line != null){
                words.addAll(Arrays.asList(line.split(" ")));
                line = reader.readLine();
            }
            for (String t : words){
                System.out.println(t);
            }
            System.out.println("-----------");
            System.out.println("Sorted:");
            System.out.println("-----------");
            ArrayList<String> newWords = new ArrayList<>();
            if(!words.isEmpty())newWords.add(words.get(0));
            words.remove(0);
            while (true) {
                for (int x = 0; x < words.size(); x++) {
                    if (newWords.get(newWords.size() - 1).substring(newWords.get(newWords.size() - 1).length() - 1).equalsIgnoreCase(words.get(x).substring(0, 1))) {
                        newWords.add(words.get(x));
                        words.remove(words.get(x));
                        x=0;
                        continue;
                    }
                    if (x == words.size() - 1) {
                        for (String t : newWords){
                            System.out.println(t);
                        }
                        return;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Wrong root");
        }
    }
}