// Input any alphabet in uppercase and print it in lowercase

import java.util.Scanner;

public class Uppercase_Lowercase {

    //Main Method
    public static void main(String[] args) {
// Object for Scanner class
        Scanner scanner = new Scanner(System.in);

        // Input an uppercase alphabet

        System.out.println("Enter any Alphabet in uppercase");
        char uppercaseChar = scanner.next().charAt(0);

        // Convert to lowercase using if-else statements
        char lowercaseChar;
        if (uppercaseChar >= 'A' && uppercaseChar <= 'Z') {
            // Convert uppercase to lowercase by adding 32 (ASCII difference) || logic explained
            lowercaseChar = (char) (uppercaseChar + 32);
            System.out.println("Lowercase: " + lowercaseChar);
        } else {
            System.out.println("Invalid input. Please enter an uppercase alphabet.");
        }


    }
}
