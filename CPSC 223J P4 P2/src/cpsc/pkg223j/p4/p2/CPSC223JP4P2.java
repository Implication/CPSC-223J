/*
 Trajon Felton
Vince Campbell
* Ray Almedia
 * CPSC 223J Project 4 Part 2
 * September 22, 2016
 * Purpose: Prints out a string based aon a random number generator,
When sleep is shown the program ends
 */
package cpsc.pkg223j.p4.p2;

import java.util.*;
public class CPSC223JP4P2 {
    public static void main(String[] args) {
        String[] Fortune ={"Study more", "Go to movie", "Relax", "Sleep"};
        
        int num = (int)(Math.random() * 4);
        while(num != 3){
            System.out.println("\t" + Fortune[num]);
            num = (int)(Math.random() * 4);
        }
        System.out.println("\t" + Fortune[num]);
        System.out.println("OK");
    }
    
}
