/*
 Trajon Felton
Vince Campbell
* Ray Almedia
 * CPSC 223J Project 3 Part 5
 * September 22, 2016
 * Purpose: Sorts an array of integers and finds where in the list an integer
is stored if its present
 */
package cpsc.pkg223j.p4.p3;

import java.util.*;
public class SortedArray {
        static int n[] = new int[7];
        static Scanner read = new Scanner(System.in);
   public static void r(){
        System.out.print("Enter 7 int numbers: ");
        for(int i = 0; i < 7; i++){
            n[i] = read.nextInt();
    }
    }
   
   public static void display(){
       System.out.print("\n\nOriginal data: ");
       for(int i = 0; i < 7; i++){
           System.out.print(n[i] + " ");
       }
       System.out.println();
       Arrays.sort(n);
       System.out.print("Sorted data: ");
       for(int i = 0; i < 7; i++){
           System.out.print(n[i] + " ");
       }
   }
   
   public static void search(){
       System.out.print("\n\nEnter an int number: ");
       int x;
       x = read.nextInt();
       int i = Arrays.binarySearch(n,x);
       if(i > 0)
       System.out.print(x + " is at location " + i + " of the sorted array ");
       else
           System.out.print(x + "is not in the sorted array");
   }
   
    public static void main(String[] args) {
        r();
        display();
        search();
    }
    
}
