/*
 * To changradee this license header, choose License Headers in Project Properties.
 * To changradee this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmarks;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class StudentMarks {

    /**
     * @param argrades the command line arguments
     */
    public static void main(String[] argrades) {
        // TODO code application logradeic here
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Full Name of the student: ");
        String name = in.nextLine();
        System.out.print("Subject 1: ");
        int marks1 = in.nextInt();
        System.out.print("Subject 2: ");
        int marks2 = in.nextInt();
        System.out.print("Subject 3: ");
        int marks3 = in.nextInt();
        System.out.print("Subject 4: ");
        int marks4 = in.nextInt();
        System.out.print("Subject 5: ");
        int marks5 = in.nextInt();
        int t = marks1 + marks2 + marks3 + marks4 + marks5;
        double p = t / 500.0 * 100.0;
        String grade = "";
        if (p >= 90)
            grade = "A+";
        else if (p >= 80)
            grade = "A";
        else if (p >=70)
            grade = "B+";
        else if (p >= 60)
            grade = "B";
        else if (p >= 50)
            grade = "C";
        else if (p >= 40)
            grade = "D";
        else
            grade = "E";
            
        System.out.println("Students name = " + name);
        System.out.println("Subject 1 = " + marks1);
        System.out.println("Subject 1 = " + marks2);
        System.out.println("Subject 1 = " + marks3);
        System.out.println("Subject 1 = " + marks4);
        System.out.println("Subject 1 = " + marks5);
        System.out.println("Percentagradee = " + p);
        System.out.println("Grade = " + grade);

    }
    
}
