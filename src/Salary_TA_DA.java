/* WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary
 HRA = basic salary 10%
 DA = Basic salary 8%
 TA = Basic salary 9%
 PF= Basic salary 20%
 Gross salary = basic salary + HRA + TA + DA -PF */


import java.util.Scanner;

public class Salary_TA_DA {
    //Main method
    public static void main(String[] args) {
// Object for Scanner class
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter employee id: ");
        String employeeId = scanner.nextLine();

        System.out.print("Enter basic salary: ");
        double basicSalary = scanner.nextDouble();

        // Initialize variables for salary components
        double hra = 0, da = 0, ta = 0, pf = 0, grossSalary = 0;

        // Check if basic salary is positive
        if (basicSalary > 0) {
            hra = basicSalary * 0.10;
            da = basicSalary * 0.08;
            ta = basicSalary * 0.09;
            pf = basicSalary * 0.20;
            grossSalary = basicSalary + hra + ta + da - pf;
        } else {
            System.out.println("Invalid input! Basic salary must be greater than 0.");
        }

        // Print if results if valid
        if (basicSalary > 0) {
            System.out.println("Employee Name: " + name);
            System.out.println("Employee ID: " + employeeId);
            System.out.println("Basic Salary: " + basicSalary);
            System.out.println("HRA (10%): " + hra);
            System.out.println("DA (8%): " + da);
            System.out.println("TA (9%): " + ta);
            System.out.println("PF (20%): " + pf);
            System.out.println("Gross Salary: " + grossSalary);
        }


    }
}










