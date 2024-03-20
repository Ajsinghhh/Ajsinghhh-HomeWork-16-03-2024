/* WAP to input enter any two number and ask user to enter their symbol (+, -, /, *) find addition,
subtraction, multiplication and division according to their symbol (using if else)*/


import java.util.Scanner;

public class Add_Mul_Sub_Division {
    // Main Method
    public static void main(String[] args) {
//Object for scanner class

        Scanner scanner = new Scanner(System.in);

        // Inputting of  two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Input the operation symbol (+, -, *, /)
        System.out.print("Enter the operation symbol (+, -, *, /0): ");
        char operation = scanner.next().charAt(0);

        double result;

        //  operation based on the symbol
        if (operation == '+') {
            result = num1 + num2;
            System.out.println("Addition result: " + result);
        } else if (operation == '-') {
            result = num1 - num2;
            System.out.println("Subtraction result: " + result);
        } else if (operation == '*') {
            result = num1 * num2;
            System.out.println("Multiplication result: " + result);
        } else if (operation == '/') {
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println("Division result: " + result);
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
        } else {
            System.out.println("Invalid operation symbol. Please enter +, -, *, or /.");
        }


    }
}







