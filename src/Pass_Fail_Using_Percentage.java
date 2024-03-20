/*. WAP to input student name, roll no, 3 subjects marks and find out total,
percentage and result if he is pass or fail on basis of percentage (pass>=35)
and also give them grade as per the below grading standard
 >= 80 A+
 >= 60 A
 >= 50 B
 >= 35 C */

import javax.xml.transform.Result;
import java.util.Scanner;

//Class Name
public class Pass_Fail_Using_Percentage {

    public static void main(String[] args) {

        // Object for scanner class
        Scanner scanner = new Scanner(System.in);

        // Student details
        System.out.println("Enter Students Name :  ");
        String Name = scanner.nextLine();

        System.out.println("Enter Students Roll no : ");
        int Rollno = scanner.nextInt();

        System.out.println("Emter Marks For Maths : ");
        int Maths = scanner.nextInt();

        System.out.println("Enter Marks For English : ");
        int English = scanner.nextInt();

        System.out.println("Enter Marks For Science : ");
        int Science = scanner.nextInt();

        // find out total marks
        int TotalMarks = Maths + English + Science;

        // Find out the Percentage
        double Percentage = (TotalMarks / 3.0) ;

        // Find out Pass or Fail || Logic used  Ternary Operator

        String Result = (Percentage >= 35) ? "Pass" : "Fail";

        //Grading

        String Grade;
        if (Percentage >= 80) {
            Grade = "A+";
        } else if (Percentage >= 60) {
            Grade = "A";
        } else if (Percentage >= 50) {
            Grade = "B";
        } else {
            Grade = "C";
        }

        System.out.println("Students Name " + Name);
        System.out.println("Students Roll no " + Rollno);
        System.out.println("TotalMarks " + TotalMarks);
        System.out.println("Percentage : " + Percentage + "%");
        System.out.println("Result : " + Result);
        System.out.println("Grade : " + Grade);


    }


}



