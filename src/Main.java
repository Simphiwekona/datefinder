import java.time.LocalDate;
import java.util.Scanner;

public class Main {
     public static String findDay(int month, int day, int year)
    {
        LocalDate localDate = LocalDate.of(year, month, day);
        String dayOfWeek = localDate.getDayOfWeek().toString();

        return dayOfWeek;
    }
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter year: ");
        int year = scanner.nextInt();

        System.out.println("Enter month: ");
        int month = scanner.nextInt();

        System.out.println("Enter Day: ");
        int day = scanner.nextInt();


        String result = findDay(month, day, year);
        System.out.println(result);
    }

}