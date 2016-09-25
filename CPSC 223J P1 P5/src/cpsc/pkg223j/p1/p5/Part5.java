/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpsc.pkg223j.p1.p5;

import java.util.Scanner;
public class Part5 {
    public static void main(String[] args) {
       //Part 5
            Scanner read = new Scanner(System.in);
            int a, b, c;
            double total;
                         System.out.println("------------MENU------------");
                         System.out.println("Drinks                  1.25");
                         System.out.println("Chips                   1.09");
                         System.out.println("Nuts                    1.18");
                         System.out.print("  How many drinks? ");
                         a = read.nextInt();
                         System.out.print("  How many chips? ");
                         b = read.nextInt();
                         System.out.print("  How many nuts? ");
                         c = read.nextInt();
                         total = 1.25 * a + 1.09 * b + 1.18 * c;
                         System.out.printf("\tTotal bill = %.2f\n\n", total);
    }
    
}
