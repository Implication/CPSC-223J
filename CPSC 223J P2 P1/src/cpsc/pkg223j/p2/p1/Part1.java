/*
 Trajon Felton

* Ray Almedia
 * CPSC 223J Project 2 Part 1 
 * September 7, 2016
 * Purpose: Gives the current exchange rates based on us currency of yen, 
british pounds, and euro based on user input and the amount of money entered in 
terms of us dollars
 */
package cpsc.pkg223j.p2.p1;

import java.util.Scanner;
public class Part1{
    public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
       double s, f, i;  //Start number, finishing number, and jump number
       //Prompt the user for imput
       System.out.print("Please enter the table info(Starting Point, Finish, "
               + "Jump/Increment By): ");
       s = read.nextInt();
       f = read.nextInt();
       i = read.nextInt();
       
       //This displays the top of the table of exchange rates
       System.out.println("$\t\tҰ\t  £\t  €");
       for(int x = 1; x <= 40; ++x){
           System.out.print('\u005F');
       }
       
       //This is to simply print out a new line after printing the top of the 
       //table
       System.out.println();
       /*This for loop is to convert the exchange rates to each currency based 
       on user input of the starting point, where to finish, and the 
       incrementation. This will continue to generate numbers until it has 
       reach the finishing  point inputted in by the user.*/
       for(double y = s; y <= f; y += i){
           double yen = y * 102.313189;
           double pound = y * 0.744397;
           double euro = y * 0.890260;
           System.out.printf(" %-8.2f\t%-10.2f%-8.2f%-8.2f\n", y,yen, pound, 
                   euro);
       }
    }
    
}
