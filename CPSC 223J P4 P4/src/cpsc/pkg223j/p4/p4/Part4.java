/*
 Trajon Felton
Vince Campbell
* Ray Almedia
 * CPSC 223J Project 3 Part 5
 * September 22, 2016
 * Purpose: Computes the average of a series of integers and their
variance. Displays these values in the main method
 */
package cpsc.pkg223j.p4.p4;

imprt java.util.*;
public class Part4 {
    static int calcAverage(int [] testVals ){
        int average = 0;
        int size = testVals.length;
        for(int i = 0; i < size; i++){
            average += testVals[i];
        }
        average /= size;
        return average;
    }
    
    static int variance(int testVals[]){
        int size = testVals.length;
        int avg = calcAverage(testVals);
        
        int n = 2^2;
        int var = 0;
        for(int i = 0; i < size; i++){
            n = testVals[i] - avg;
            n *= n;
            var += n;
        }
        var /= size;
        return var;
    }
    public static void main(String[] args) {
        int testVals[] = { 89, 95, 72, 83, 99, 54, 86, 75, 92, 73, 79, 75, 82
                , 83, 73 };
        int avg = calcAverage(testVals);
        int var = variance(testVals);
        System.out.println("The average of these numbers is: " + avg);
        System.out.println("The variance of these numbers is: " + var);
        }
    }
    
}
