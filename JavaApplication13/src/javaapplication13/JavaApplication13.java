/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

import java.util.Scanner;

/**
 *
 * @author TraFe
 */
public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner read = new Scanner(System.in);
        String PN; // Reads in the alphanumeric string
        char con; //Condition to see if the user wants to enter more numbers
        char b;
        do{
        System.out.print("Enter a phone number: ");
        PN = read.nextLine();
        String num = "";
        
        for(int x = 0; x < PN.length(); x++){
            if(x == 9)
                num += '-';
                switch(PN.charAt(x)){
                    case 'A':
                    case 'B':
                    case 'C':
                        b = '2';
                        num += b;
                        break;
                    case 'D':
                    case 'E':
                    case 'F':
                        b = '3';
                        num += b;
                        break;
                    case 'G':
                    case 'H':
                    case 'I':
                        b = '4';
                        num += b;
                        break;
                    case 'J':
                    case 'K':
                    case 'L':
                        b = '5';
                        num += b;
                        break;
                    case 'M':
                    case 'N':
                    case 'O':
                        b = '6';
                        num += b;
                        break;
                    case 'P':
                    case 'Q':
                    case 'R':
                    case 'S':
                        b = '7';
                        num += b;
                        break;
                    case 'T':
                    case 'U':
                    case 'V':
                        b = '8';
                        num += b;
                        break;
                    case 'W':
                    case 'X':
                    case 'Y':
                    case 'Z':
                        b = '9';
                        num += b;
                        break;
                    default:
                        num += PN.charAt(x);
                }
            }
        
        System.out.println(PN + " or " + num + "\n");
        System.out.print("Continue(y/n)?: ");
        con = read.nextLine().charAt(0);
        } while(con == 'y' || con == 'Y');
    }
    
}
