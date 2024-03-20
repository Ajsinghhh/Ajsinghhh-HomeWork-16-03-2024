//WAP to input any two number and find out its odd or even using ternary operator(? :)

import java.util.Scanner;

//Class Name
public class Odd_Even_Using_Ternary_Operator {
    //Main method
    public static void main(String[] args) {
        //Object for scanner class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first number: ");
        int number1 = scanner.nextInt();

        System.out.println("Input the second number: ");
        int number2 = scanner.nextInt();

        // Using ternary operator to check if number1 is odd or even
        String result1 = (number1 % 2 == 0) ? "even" : "odd";

        // Using ternary operator to check if number2 is odd or even
        String result2 = (number2 % 2 == 0) ? "even" : "odd";

        System.out.println("number1 " + "is " + result1);
        System.out.println("number2 " + "is " + result2);


    }


}
