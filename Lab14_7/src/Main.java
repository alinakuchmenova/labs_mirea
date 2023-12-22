import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String text="";
        Pattern pattern0 = Pattern.compile("\\W");
        Pattern pattern1 = Pattern.compile("\\w{8,}");
        Pattern pattern2 = Pattern.compile("\\w*[a-z]\\w*");
        Pattern pattern3 = Pattern.compile("\\w*[A-Z]\\w*");
        Pattern pattern4 = Pattern.compile("\\w*[0-9]\\w*");
        for (int x = 0; x < 6; x++){
            switch (x){
                case 0->text = "F032_Password";
                case 1->text = "TrySpy1";
                case 2->text = "smart_pass";
                case 3->text = "A007";
                case 4->text = "F032_Pass,word";
                case 5->text = "TrySpy1More";
            }
            Matcher matcher0 = pattern0.matcher(text);
            Matcher matcher1 = pattern1.matcher(text);
            Matcher matcher2 = pattern2.matcher(text);
            Matcher matcher3 = pattern3.matcher(text);
            Matcher matcher4 = pattern4.matcher(text);
            if (!matcher0.find()&&matcher1.find()&&matcher2.find()&&matcher3.find()&&matcher4.find()){
                System.out.println(text+" is RIGHT");
            }
            else{
                System.out.println(text+" is NOT right");
            }
        }
    }
}
