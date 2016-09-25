/*
Name		Trajon Felton
Project No:	No 1
Due		September 1, 2016
Professor 	Ray Ahmadnia
purpose: Learning Input, output, arithetic, and formatting methods in java
 */
package javaapplication1;

import java.util.Scanner;
public class Part1 { 
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        //Part 1
			//Variable Declaration
			float width, length;
			//Output the drawing of the rectangle and asking the user for width and length:
			System.out.println("1. For the following rectangle:");
			System.out.println("\t-----------------------");
			System.out.println("\t|                     |");
			System.out.println("\t|                     | width");
			System.out.println("\t|                     |");
			System.out.println("\t|                     |");
			System.out.println("\t-----------------------");
			System.out.println("\t        length");
			//Here we prompt the user to enter the width and length of the rectangle
			System.out.print("Enter the measure of width: ");
			width = read.nextFloat();
			System.out.print("Enter the measure of length: ");
			length = read.nextFloat();
			//Print out the area and perimeter of the rectangle using printf fromt C
			System.out.printf("\tArea = %.2f\n \tPerimeter = %.2f\n\n",(width * length), ((2 * width) + (2 * length)));
		
    } 
}
