/*
 Trajon Felton

* Ray Almedia
 * CPSC 223J Project 3 Part 4
 * September 15, 2016
 * Purpose: Gives the perimeter and area of a triangle based on user input
 */
package cpsc.pkg223j.p3.p4;

import java.util.*;

class Triangle{
    double area(double a, double b, double c){
        double p = perimeter(a,b,c)/2;
        a = Math.sqrt((double)p * (p - a) * (p - b) * (p - c));
        return a;
    }
    double perimeter(double a, double b, double c){
        double p = a+b+c ;
        return p;
    }
}
public class Part4 {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        Scanner read = new Scanner(System.in);
        double a,b,c;
        System.out.print("Enter the value of the 3 lengths: ");
        a = read.nextDouble();
        b = read.nextDouble();
        c = read.nextDouble();
        System.out.printf("The perimeter of this triangle is %.2f\n"
                + "The area of this triangle is %.2f\n", t.perimeter(a,b,c)
        , t.area(a, b, c));
    }
    
}
