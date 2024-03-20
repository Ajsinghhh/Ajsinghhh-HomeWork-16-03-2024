/* . Write Java program to allow the user to input his/her age. Then the program will show if the
person is eligible to vote. A person who is eligible to vote must be older than or equal to 18 years
old */


import java.util.Scanner;

public class Vote_Eligibility {
    //Main method
    public static void main(String[] args) {

//Object for Scanner class
        Scanner scanner = new Scanner(System.in);

        // Input the age
        System.out.print("Enter your age: ");
        double age = scanner.nextDouble();

        // Criteria used
        if (age >= 18) {
            System.out.println("You are eligible to vote ");
        } else {
            System.out.println("You are not eligible to vote ");
        }
    }
}





