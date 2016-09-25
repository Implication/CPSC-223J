/*
 Trajon Felton

* Ray Almedia
 * CPSC 223J Project 2 Part 1 
 * September 7, 2016
 * Purpose: This program generates random numbers to place in addition programs
that will be solved by the user
 */
package cpsc.pkg223j.p2.p3;

import java.util.*;
public class Part3 {

    public static void main(String[] args) {
        //Variable Declarations
        Scanner  read = new Scanner(System.in);
        char condition; //Used in order to get the input of whether the user 
        //wants to continue the program or not
        int num1, num2, input; // Num1 and num2 are random generated numbers
        //by the computer, input is the answer the user gives to the problem
        //Prompt what the program will basically do
        System.out.println("Lets pratice addition with random integer "
                + "numbers < 100");
        
         /*Do-while Loops
        Purpose: this is used to see if the user wants to do more addition
        or quit the program*/
        do{
            //Get the randomly generated numbers
            num1 = (int)(Math.random() * 100); 
            num2 = (int)(Math.random() * 100);
            //Ask the user for the sum of the random numbers
            System.out.printf("\t%d + %d =? ", num1, num2);
            input = read.nextInt();
            //If the anser is corrent print correct, otherwise print that it
            // is wrong
            if(num1 + num2 == input)
                System.out.println("\t  CORRECT");
            else
                System.out.println("\t  WRONG");
            //Prompt the user on whether to exit out the program or continue
            System.out.print("\t  Continue(y/n)? ");
            condition = read.next().charAt(0);
       }while(condition == 'y');
   }
}
