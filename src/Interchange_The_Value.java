// WAP to input any two numbers and then print their interchanged value

import java.util.Scanner;

public class Interchange_The_Value {

    // Main Method
    public static void main(String[] args) {

        //Object for scanner class
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        int Number1 = scanner.nextInt();

        System.out.println("Enter the second number : ");
        int Number2 = scanner.nextInt();

// Logic used

        if (Number1 != Number2) {
            int temp = Number1;
            Number1 = Number2;
            Number2 = temp;

            System.out.println("Numbers have been interchanged ");
        } else
            System.out.println("Both numbers are same , can not interchange");
        System.out.println("First Number : " + Number1);
        System.out.println("Second number : " + Number2);


    }
}
