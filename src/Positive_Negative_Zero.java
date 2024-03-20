// WAP to input any number and find out if it is positive , negative or zero


import java.util.Scanner;


public class Positive_Negative_Zero {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter  a Number ");
        double Number = scanner.nextDouble();


        if (Number > 0) {
            System.out.println("The Number is Positive ");
        } else if (Number < 0) {
            System.out.println("The Number is a Negative ");
        } else {
            System.out.println("The Number has a  Zero Value");
        }


    }


}
