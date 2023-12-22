import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String text = "a) пример правильных выражений: 29/02/2000, 30/04/2003, 01/01/2003. b) пример неправильных выражений: 29/02/2001, 30-04-2003, 1/1/1899.";
        Pattern pattern = Pattern.compile("((([0-2]\\d|3[01])/(0[13578]|1[02])|([0-2]\\d|30)/(0[469]|11)|([0-1]\\d|2[0-8])/02)/(19|[2-9]\\d)\\d\\d|29/02/(19|[2-9]\\d)([02468][048]|[13579][26]))");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
