/*
 Trajon Felton

* Ray Almedia
 * CPSC 223J Project 3 Part 2 
 * September 15, 2016
 * Purpose: Gives a salutation based on user input
 */
package cpsc.pkg223j.p3.p2;

import java.util.Scanner;
/*Class FormLetterWriter
Purpose: Contains the method
displaySalutations which based on 
the inputted arguments will change
the salutation greeting on top of a buisness letter*/
class FormLetterWriter{
    /*Display Salutation Method
    Purpose: this will display a cortesy title 
    follwed by the persons last name*/
     void displaySalutation(String ln, char gender){
        String ct; //Represents the courtesy title
        /*Determine the gender of the user by input*/
        switch (gender) {
            case 'M':
            case 'm':
                ct = "Mr.";
                break;
            case 'F':
            case 'f':
                ct = "Mrs.";
                break;
            default:
                ct = "This is an it, not valid!";
                break;
        }
        //Display the salutation
        System.out.println("Dear " + ct + " " + ln + ":");
    }
     
     /*This display method displays by first 
     and last name, based on the argument of 2 strings*/
    void displaySalutation(String fn, String ln){
        System.out.println("Dear " + fn + " " + ln + ":");
    }
}

public class CPSC223JP3P2 {
    
    public static void main(String[] args) {
        //Variable Declarations
        Scanner read = new Scanner(System.in);
       String fn,ln; //First and last name of the user
       //flw is the object containing the methods of the class
       //FormLetterWritter
       FormLetterWriter flw = new FormLetterWriter(); 
       char gender; //Gender of the user
       //Prompt the user for input
       System.out.print("Enter your first and last name: ");
       fn = read.next();
       ln = read.next();
       String temp = read.nextLine();
       System.out.print("Enter your gender ");
       gender = read.next().charAt(0);
       temp = read.nextLine();
       
       //Display the results using our class method, followed by 
       //A short buisness letter
       System.out.println("Salutations with Courtesy Title:");
       flw.displaySalutation(ln,gender);
       System.out.println("Thank you for your recent order.\n");
       System.out.println("Salutations with first and last name:");
       flw.displaySalutation(fn,ln);
       System.out.println("Thank you for your recent order.\n");
    }
    
}
