// WAP tp enter any value and the find out if it is number (0-9) or an alphabet or symbol


import java.util.Scanner;

public class Number_Alphabet_Symbol {
    // Main Method
    public static void main(String[] args) {
//Object forScanner class
        Scanner scanner = new Scanner(System.in);

        // Input a character
        System.out.print("Enter any Character : ");
        char value = scanner.next().charAt(0);

        // Check the type of the character
        if (Character.isDigit(value)) {
            System.out.println("It is a digit (0-9).");
        } else if (Character.isLetter(value)) {
            System.out.println("It is an alphabet.");
        } else {
            System.out.println("It is a symbol ");
        }

    }

}
