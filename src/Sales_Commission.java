/*WAP  to input sales id, seller's name, sales amount, basic salary and then find his/her sales
commission based on the below criteria.
sales amount >= 50,000 35%
sales amount >= 30,000 20%
Sales amount >= 20,000 10%
Sales amount >= 10,000 5%
Sales amount < 10,000 2%
 */


import java.util.Scanner;

public class Sales_Commission {

    //Main method
    public static void main(String[] args) {
//Object for scanner class
        Scanner scanner = new Scanner(System.in);

//initial data required
        System.out.println("Enter Seller's Name :  ");
        String Name = scanner.nextLine();

        System.out.println("Enter sellers ID :  ");
        double ID = scanner.nextDouble();

        System.out.println("Enter amount of sales done :  ");
        double sales = scanner.nextDouble();

        System.out.println("Enter Basic salary :  ");
        double Basic_Salary = scanner.nextDouble();

        // Commission Criteria

        double commission_Rate;

        if (sales >= 50000) {
            commission_Rate = 0.35;
        } else if (sales >= 30000) {
            commission_Rate = 0.20;
        } else if (sales >= 20000) {
            commission_Rate = 0.10;
        } else if (sales >= 10000) {
            commission_Rate = 0.05;
        } else {
            commission_Rate = 0.02;
        }

        double commission = sales * commission_Rate;
        double TotalSalary = Basic_Salary + commission;

        System.out.println("Sellers Name:  " + Name);
        System.out.println("Sellers Id : " + ID);
        System.out.println("Sales Amount : " + sales);
        System.out.println("Basic Salary : " + Basic_Salary);
        System.out.println("Commission Earned : " + commission);
        System.out.println("Total Salary : " + TotalSalary);

    }


}




