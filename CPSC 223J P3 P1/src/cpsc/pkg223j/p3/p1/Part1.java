/*
 Trajon Felton

* Ray Almedia
 * CPSC 223J Project 2 Part 1 
 * September 15, 2016
 * Purpose: Given a numerical date, this will print out an alphanumeric
version of the current date
 */
package cpsc.pkg223j.p3.p1;

import java.util.*;
public class Part1 {
    public static void main(String[] args) {
        //Variable Declaration
        Scanner read = new Scanner(System.in);
        String date;
        int m, d; //Takes in the integer of month and day
        char con; //Condition to loop the program
        do{
        String month = "", day = "", year = ""; // Takes in the parts of
        //the month, day, and year
        //Promp the user for input
        System.out.print("Enter the today's date(mm/dd/yyyy): ");
        date = read.nextLine();
        int i = 0;
        /*While-loop
        Purpose: to go through the entire string of date
        and set the value of our individual strings month, day, and year
        equal to certain parts of the date string, and modify their contents
        to print out our desired output*/
        while(i < date.length()){
            /*If-else condition
            Purpose: if the month and day strings are empty, then it is
            the year, so we simply ned to add the character digits into our
            year string*/
           if(!month.isEmpty() && !day.isEmpty()){
               year += date.charAt(i);
               i++;
           }
           else{
               //We check to see if the month string is empty, otherwise
               //It has to be the day part of the string
               if(month.isEmpty()){
                   //We simply add the characters to our month string while
                   //the character is not a forward slash
                   while(date.charAt(i) != '/'){
                       month += date.charAt(i);
                       i++;
                   }
                   //We increment again to skip the forward slash
                   i++;
                   //Converting the string month into a useable integer
                   m = Integer.parseInt(month);
                   //Condition sets month according to the integer digit from
                   //January to December
                   if(m == 1){ month = "Jan "; }
                   else if(m == 2){ month = "Feb"; }
                   else if(m == 3){ month = "Mar"; }
                   else if(m == 4){ month = "Apr"; }
                   else if(m == 5){ month = "May"; }
                   else if(m == 6){ month = "Jun"; }
                   else if(m == 7){ month = "Jul"; }
                   else if(m== 8){ month = "Aug"; }
                   else if(m == 9){ month = "Sep"; }
                   else if(m == 10){ month = "Oct"; }
                   else if(m == 11){ month = "Nov"; }
                   else { month = "Dec"; }
               }
               //Otherwise it is the day part of the date string
               else{
                   //We add chaacters to the date string until we hit a 
                   //forward slash
                      while(date.charAt(i) != '/'){
                       day += date.charAt(i);
                       i++;
               }
                      //We increment to skip the forward slash 
                      i++;
                      //Converting the day string into an integer
                      d = Integer.parseInt(day);
                      //Condition to add either "st", "2nd", "3rd", or "th"
                      //Based on the integer of the string
                      if(d == 1 || d == 21 || d == 31) day += "st";
                      else if(d == 2 || d == 22) day += "nd";
                      else if(d == 3 || d == 23) day += "rd";
                      else day += "th";
               
           }
        }
    }
        //Print out our results
        System.out.println("Today is " + month + " " + day + ", " + year);
        //Prompt the user to restart the program
        System.out.print("Continue(y/n)? ");
        con = read.next().charAt(0);
        //This is here to allow the terminal to wait for new input if the info
        //is yes
        String temp = read.nextLine();
    } while(con == 'y' || con == 'Y');
  }
}
                                                                                                                                                        0