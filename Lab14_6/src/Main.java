import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String text = "a) пример правильных выражений: user@example.com, root@localhost b) пример неправильных выражений: myhost@@@com.ru, @my.ru, Julia String.";
        Pattern pattern = Pattern.compile("[a-zA-Z][\\w.]*@\\w+(\\.\\w+)?");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
