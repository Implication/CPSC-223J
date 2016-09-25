/*
 Trajon Felton

* Ray Almedia
 * CPSC 223J Project 3 Part 5
 * September 15, 2016
 * Purpose: Computes the sum of of the series 3^10 recursively
based on the increase of the exponential value
 */
package cpsc.pkg223j.p3.p5;

import java.util.*;
public class Part5 {
    /*Factorial method
    Purpose: Takes a base number, an exponential value
    and computs the sum up to that exponential value 
    recursively*/
       static long factoral(int n, int base, int sum){
           
            if(n == 1) return (long)sum; //Base case returns our sum
            else{
                double x = Math.pow(base, n); //x is used to compute the 
                //base to the power of n
                return factoral((n - 1),base, sum += x); //Then we return recursively 
                //n-1, and add x to our sum
           }
       }
    public static void main(String[] args) {
        //Print out our results, if wanted we can actually compute any number
        //With this method, in this case we compute 3 to the power of 10
       System.out.println("The computed sum of 3 to the power of 10 is: " 
               + factoral(10,3,3));
    }
    
}
