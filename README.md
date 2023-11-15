# Date To Day Converter

This Java program includes a function `findDay` that takes a month, day, and year as integers and returns the corresponding day of the week as a string using the `java.time.LocalDate` class.

## Usage

To use the `findDay` function, include the following in your Java code:

```java
import java.time.LocalDate;

class Result {

    public static String findDay(int month, int day, int year) {
        // Create a LocalDate object using the provided year, month, and day
        LocalDate localDate = LocalDate.of(year, month, day);

        // Get the day of the week as a string
        return localDate.getDayOfWeek().toString();
    }

    public static void main(String[] args) {
        
        int month = 11; // November
        int day = 15;
        int year = 2023;

        String result = findDay(month, day, year);
        System.out.println("The day corresponding to " + year + "-" + month + "-" + day + " is " + result);
    }
}
