/*
Name		Trajon Felton
Project No:	No 1
Due		September 1, 2016
Professor 	Ray Ahmadnia
purpose: Learning Input, output, arithetic, and formatting methods in java
 */
package project.pkg1.p2.cpsc.pkg223j;

import java.util.Scanner;
public class Part2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        //Part 2
        
			//Variable Declaration
			int a, b;
			//prompt the user for the two integers
			System.out.print("2. Enter two integer numbers: ");
			//Read in the integers into the variables a and b
			a = read.nextInt();
			b = read.nextInt();
			//Print out the results
			System.out.printf("\t%d + %d = %d\n", a,b,(a + b));
			System.out.printf("\tThe total of %d and %d is %d\n", a,b,(a + b));
			System.out.printf("\tand their average is %d\n\n", ((a + b) / 2));
    }
    
}
