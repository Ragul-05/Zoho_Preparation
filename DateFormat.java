import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;

public class DateFormat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter date (dd/MM/yyyy): ");
            String inputdate = scanner.nextLine();

            System.out.print("Enter days to add: ");
            int daystoadd = scanner.nextInt();

            // FIXED: Set correct date format pattern
            SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
            dateformat.setLenient(false);

            Date date = dateformat.parse(inputdate);

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.add(Calendar.DAY_OF_MONTH, daystoadd);

            Date newdate = calendar.getTime();
            String outputdate = dateformat.format(newdate);

            System.out.println("New Date: " + outputdate);

        } catch (Exception e) {
            System.out.println("Invalid date format. Please enter the date in dd/MM/yyyy format.");
        } finally {
            scanner.close();
        }
    }
}
