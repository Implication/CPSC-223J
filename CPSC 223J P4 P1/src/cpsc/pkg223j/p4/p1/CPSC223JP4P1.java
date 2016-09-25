/*
 Trajon Felton
Vince Campbell
* Ray Almedia
 * CPSC 223J Project 4 Part 1
 * September 22, 2016
 * Purpose: Displays an inventory of shirts, Computes the sum of red t shirts
and the number of large t=-shirts
 */
package cpsc.pkg223j.p4.p1;
   
public class CPSC223JP4P1 {
     static void display(String[][] inv, int total, int lts, int rts){
            System.out.println("This is our inventory");
            for(int i = 0; i < 5; i++){
                for(int j = 0; j < 5; j++){
                    System.out.printf("%5.5s", inv[i][j]);
                }
                System.out.println();
        }
            System.out.println();
            System.out.println(" Total of all shirts: " + total);
            System.out.println(" Total number of red shirts: " + rts);
            System.out.println(" Total number of large shrits: " + lts);
     }
    public static void main(String[] args) {
       String [][] inv =  {{"     ", "S", "M", "L", "XL" }, 
                          {"Red", "1", "2", "3", "4" },
                          {"Black", "5", "6", "7", "8"},    
                          {"Blue", "9", "10", "11", "12" },
                          {"Green", "13", "14", "15", "16" } };
       
       int total = 0;
       int rts = 0;
       int lts = 0;
       for(int i = 1; i < 5; i++){
           for(int  j = 1; j < 5; j++){
               total += Integer.parseInt(inv[i][j]);
               if(i == 1)
                  rts += Integer.parseInt(inv[i][j]);
               if(j == 3)
                    lts += Integer.parseInt(inv[i][j]);
               }
           }
       display(inv, total, lts, rts);
       }
}