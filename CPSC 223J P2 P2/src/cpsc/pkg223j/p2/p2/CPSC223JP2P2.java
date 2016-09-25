/*
 Trajon Felton

* Ray Almedia
 * CPSC 223J Part 2
 * September 7, 2016
 * Purpose: Given a sentece by user input, this prints out the number of uppercase 
letters
digits and vowels within the given input
 */

package cpsc.pkg223j.p2.p2;

import java.util.Scanner;
public class CPSC223JP2P2 {
    public static void main(String[] args) {
        //Variable declarations
        Scanner read= new Scanner(System.in);
        String sentence;
        int UCL = 0; //Counter for number of upper case letters
        int digit = 0; //Conter for number of digits
        int vowel = 0;// Counter for number of vowels
        char c; //This is used to get the letter within the given setnece, 
        //and to determine what the letter is
        //Prompt the user
        System.out.print("Enter Sentence: ");
        sentence = read.nextLine();
        int x = 0;
        /*While-Loop
        Purpose: given a letter or digit in the sentence
        this will count until the end of the sentence
        how many uppercase letters, digits, and vowels are
        within that sentence*/
        while(x < sentence.length()){
            c = sentence.charAt(x); //This gets the current letter at position x
            //If it is an uppercase letter, then increment the number of ucl's
            if(Character.isUpperCase(c))
                UCL++;
            //If it is a vowel, then increment the number of vowels
            if(c == 'a' || c == 'A' ||
               c == 'e' || c == 'E' ||
               c == 'i' || c == 'I' ||
               c == 'o' || c == 'O' ||
               c == 'u' || c == 'U'
             )
                vowel++;
            //If the character is a digit, than increment the number of digits
            if(Character.isDigit(c))
                digit++;
            x++;
        }
        //Print out the results
        System.out.printf("Number of uppercase letters.......%d\n", UCL);
        System.out.printf("Number of digits .................%d\n", digit);
        System.out.printf("Number of vowels..................%d\n", vowel);
    }
    
}
