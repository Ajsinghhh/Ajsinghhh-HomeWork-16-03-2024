/*. WAP to input student name, roll no, 3 subjects marks and find out total,and determine if
he is pass or fail on basis of passing all 3 subjects and also give them grade
>= 80 A+
>= 60 A
>= 50 B
>= 35 C
*/


import javax.xml.transform.Result;
import java.util.Scanner;

public class Pass_Fail_Using_Subjects {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

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


        String Result = (Maths >= 35 && English >= 35 && Science >= 35) ? "Pass" : "Fail";

        String Grade;
        if (TotalMarks >= 80) {
            Grade = "A+";
        } else if (TotalMarks >= 60) {
            Grade = "A";
        } else if (TotalMarks >= 50) {
            Grade = "B";
        } else {
            Grade = "C";
        }
        System.out.println("Students Name " + Name);
        System.out.println("Students Roll no " + Rollno);
        System.out.println("TotalMarks " + TotalMarks);
        System.out.println("Total Marks : " + TotalMarks);
        System.out.println("Result : " + Result);
        System.out.println("Grade : " + Grade);


    }


}
