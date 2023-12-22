import java.text.ParseException;
import java.util.Calendar;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        System.out.println("Enter year");
        int year = scanner.nextInt();
        System.out.println("Enter month");
        int month = scanner.nextInt();
        System.out.println("Enter day");
        int day = scanner.nextInt();
        System.out.println("Enter hour");
        int hour = scanner.nextInt();
        System.out.println("Enter minute");
        int minute = scanner.nextInt();
        try {
            date = simpleDateFormat.parse(day + "." + month + "." + year + ", " + hour + ":" + minute);
            calendar.set(year, month - 1, day, hour, minute);
            System.out.println(simpleDateFormat.format(date));
            System.out.println(simpleDateFormat.format(calendar.getTime()));
        } catch (ParseException e) {
            System.out.println("Wrong info");
        }
    }
}