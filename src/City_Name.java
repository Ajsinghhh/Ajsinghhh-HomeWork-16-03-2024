/*  WAP to Input any alphabet from A to F and print their city name accordingly (use if else) any other
alphabet should be invalid entry*/


import java.util.Scanner;

public class City_Name {

    //Main Method
    public static void main(String[] args) {

// Object for scanner class
        Scanner scanner = new Scanner(System.in);

        // Input an alphabet
        System.out.print("Enter an alphabet (A to F): ");
        char alphabet = scanner.next().toUpperCase().charAt(0);

        // Check if the alphabet input  is valid
        if (alphabet == 'A') {
            System.out.println("City: Athens");
        } else if (alphabet == 'B') {
            System.out.println("City: Brisbane");
        } else if (alphabet == 'C') {
            System.out.println("City: Chennai");
        } else if (alphabet == 'D') {
            System.out.println("City: Dubai");
        } else if (alphabet == 'E') {
            System.out.println("City: Edinburgh");
        } else if (alphabet == 'F') {
            System.out.println("City: Faisalabad ");
        } else {
            System.out.println("Invalid entry. Please enter an alphabet from A to F.");
        }


    }

}










