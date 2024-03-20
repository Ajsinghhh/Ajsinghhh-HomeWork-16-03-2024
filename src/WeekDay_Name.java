import java.util.Scanner;

public class WeekDay_Name {

    // Main Method
    public static void main(String[] args) {
//Object for scanner class
        Scanner scanner = new Scanner(System.in);

// Input a number
        System.out.print("Enter a number 1 to 7 : ");
        int WeekdayNumber = scanner.nextInt();

        // Check the day of the week
        if (WeekdayNumber >= 1 && WeekdayNumber <= 7) {
            String dayName;
            if (WeekdayNumber == 1) {
                dayName = "Monday";
            } else if (WeekdayNumber == 2) {
                dayName = "Tuesday";
            } else if (WeekdayNumber == 3) {
                dayName = "Wednesday";
            } else if (WeekdayNumber == 4) {
                dayName = "Thursday";
            } else if (WeekdayNumber == 5) {
                dayName = "Friday";
            } else if (WeekdayNumber == 6) {
                dayName = "Saturday";
            } else {
                dayName = "Sunday";
            }
            System.out.println("Day of the week: " + dayName);
        } else {
            System.out.println("Invalid input. Please enter a number between 1 and 7.");
        }

    }
}






