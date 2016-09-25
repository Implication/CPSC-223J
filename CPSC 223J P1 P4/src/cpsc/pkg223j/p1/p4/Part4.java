/*
Name		Trajon Felton
Project No:	No 1
Due		September 1, 2016
Professor 	Ray Ahmadnia
purpose: Learning Input, output, arithetic, and formatting methods in java
 */
package cpsc.pkg223j.p1.p4;

import java.util.Scanner;
public class Part4 {
    public static void main(String[] args) {
        //Part 4
            Scanner read = new Scanner(System.in);
                //Variable Declarations
                String fn, ln; /*Read in the first and last name with strings*/
                char mi; /*Read in the middle initial with a character type*/
                System.out.println("4. Give me your name, I will send you a birthday card");
                System.out.print("\tWhat is your first name? ");
                fn = read.next();
                System.out.print("\tWhat is your middle initial? ");
                mi = read.next().charAt(0);
                System.out.print("\tWhat is your last name? ");
                ln = read.next();
                System.out.printf("  <<<<<<<Happy Birthday %s %c. %s>>>>>>>\n\n", fn, mi, ln);
    }
    
}
