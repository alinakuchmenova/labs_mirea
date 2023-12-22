import java.text.Format;
import java.text.ParseException;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Date date1 = new Date();
        date1.setTime(System.currentTimeMillis());
        Date date2 = new Date();
        SimpleDateFormat SDF = new SimpleDateFormat();
        System.out.println("Enter date in format DD.MM.YYYY, HH:MM");
        String dateStr = scanner.nextLine();
        try {
            date2 = SDF.parse(dateStr);
            if(date1.after(date2)) System.out.println("Entered time is earlier then current");
            else if(date1.before(date2)) System.out.println("Entered time is later then current");
            else System.out.println("Entered time is similar with current");
        } catch (ParseException e) {
            System.out.println("Wrong date");
        }
    }
}