// WAP input any five number and then find average of five numbers

import java.util.Scanner;

public class Average_Of_Five_Numbers {

    //Main Method
    public static void main(String[] args) {

// Object for Scanner class
        Scanner scanner = new Scanner(System.in);

        // Enter Five Numbers
        System.out.println("Enter the value of first number ");
        double Number1 = scanner.nextDouble();
        System.out.println("Enter the value of second number ");
        double Number2 = scanner.nextDouble();
        System.out.println("Enter the value of third number ");
        double Number3 = scanner.nextDouble();
        System.out.println("Enter the value of fourth number ");
        double Number4 = scanner.nextDouble();
        System.out.println("Enter the value of fifth number ");
        double Number5 = scanner.nextDouble();

        double Average = (Number1 + Number2 + Number3 + Number4 + Number5) / 5;
        //  Logic used
        if (Number1 >= 0 && Number2 >= 0 && Number3 >= 0 && Number4 >= 0 && Number5 >= 0) {


            System.out.println("Average of Five Numbers is : " + Average);
        } else {
            System.out.println(" Please Enter Value is more then o ");
        }


    }


}
