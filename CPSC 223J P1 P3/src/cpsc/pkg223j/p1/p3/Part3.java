/*
Name		Trajon Felton
Project No:	No 1
Due		September 1, 2016
Professor 	Ray Ahmadnia
purpose: Learning Input, output, arithetic, and formatting methods in java
 */
package cpsc.pkg223j.p1.p3;

import java.util.Scanner;
public class Part3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Part 3
                Scanner read = new Scanner(System.in);
                int a, b, c, total;
                //Prompt
                System.out.print("3. I can compute your midterm's average, try me\n\t Enter your scores in 3 exams: ");
                a = read.nextInt();
                b = read.nextInt();
                c = read.nextInt();
                //Arithmetic: Computing the average of the 3 scores
                total = (a + b + c) / 3;
                //Print out the results to the console
                System.out.printf("\t\t Your average is: %d\n", total);
    }
    
}
