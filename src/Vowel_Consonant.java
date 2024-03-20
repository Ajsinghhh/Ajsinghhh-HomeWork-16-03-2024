/* Write a Java program that takes the user to provide a single character from the
alphabet. Print Vowel or Consonant, depending on the user input.
For eg:
Input an alphabet: p
Expected Output :
Input letter is Consonant */

import java.util.Scanner;

public class Vowel_Consonant {

    // Main Method
    public static void main(String[] args) {

        //Object for the scanner class
        Scanner scanner = new Scanner(System.in);

        // Input a single character from the alphabet
        System.out.print("Enter a single character from the alphabet: ");
        char character = scanner.next().charAt(0);


        // Check if it is a vowel or a consonant
        if (Character.isLetter(character)) {
            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                System.out.println("Input letter is a Vowel.");
            } else {
                System.out.println("Input letter is a Consonant.");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid alphabet character.");
        }

    }
}
