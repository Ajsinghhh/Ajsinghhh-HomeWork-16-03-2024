// WAP to input any year like 1989 and find out if it is a leap year

import java.util.Scanner;

// Class Name
public class Leap_Year {
    // Main Method
    public static void main(String[] args) {
        //Object for scanner class
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a year : ");
        int Year = scanner.nextInt();

        // Check if it is a leap year || logic used
        boolean Leapyear = (Year % 4 == 0 && Year % 100 != 0) || (Year % 400 == 0);
        //Use if && else statement
        if (Leapyear) {
            System.out.println(Year + " is a Leapyear ");
        } else {
            System.out.println(Year + " is not a Leapyear ");
        }


    }


}