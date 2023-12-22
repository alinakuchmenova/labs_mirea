import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Main {
    public static void main(String[] args) {
        String devName = "Ivan";
        String taskAssignment = "01.09.2023, 09:00";
        Date taskSubmission = new Date();
        taskSubmission.setTime(System.currentTimeMillis());
        SimpleDateFormat dateFormat = new SimpleDateFormat();
        System.out.println("Имя разработчика: " + devName);
        System.out.println("Время получения задания: " + taskAssignment);
        System.out.println("Время сдачи задания: " + dateFormat.format(taskSubmission));
    }
}