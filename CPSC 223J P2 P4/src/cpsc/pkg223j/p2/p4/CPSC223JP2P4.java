/*
 Trajon Felton

* Ray Almedia
 * CPSC 323 Project 2 Part 4 
 * September 1, 2016
 * Purpose: Counts the number of yes and no votes in a given program
 */
package cpsc.pkg223j.p2.p4;

import java.util.Scanner;
public class CPSC223JP2P4 {
    public static void main(String[] args) {
        //Variable declarations
        Scanner read = new Scanner(System.in);
        String votes; //This reads in the string of yes and no's given by the 
        //user
        int count = 0; //This is simply an increment used to go through 
        //the while loop
        int yv = 0; // This counts the number of yes votes
        int nv = 0; // this counter the number of no votes
        //Prompt the user to give the string of yes and no votes
       System.out.print("Enter a string of YES and NO votes: ");
       votes = read.next();
       /*While-Loop
       Purpose: This is used to simply go through the string
       and count the number of yes and no votes*/
       while(count < votes.length()){
           if(votes.charAt(count) ==  'y' || votes.charAt(count) == 'Y')
               yv++;
           else
               nv++;
           count++;
       }
       //We place count back to zero to reuse it in other while loops
       //Print the results using stars, Stars are based on the number of votes
       // In each category
       count = 0;
       System.out.print("\tYES votes: ");
       
       while(count < yv){
           System.out.print("*");
           count++;
       }
       count = 0;
       System.out.println();
       System.out.print ("\tNO votes : ");
       
       while(count < nv){
           System.out.print("*");
           count++;
       }
       System.out.println();
    }   
}
