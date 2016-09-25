/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpsc.pkg223j.p1.p6;

import java.util.Scanner;
public class Part6 {
    public static void main(String[] args) {
       //Part 6
                    Scanner read = new Scanner(System.in);
                    float farh;
                    float cel;
                    System.out.println("I can convert temperature from degree Fahrenheit to degree Celsius. Try me");
                    System.out.print("    Enter a temperature in Fahrenheit: ");
                    farh = read.nextInt();
                    cel = 5 * (farh - 32)/ 9;
                    System.out.printf("    %.0f Fahrenheit is %.2f Celsius\n\n",farh,cel);
    }
    
}
