/*
 Trajon Felton

* Ray Almedia
 * CPSC 223J Project 3 Part 3
 * September 15, 2016
 * Purpose: Gives a bill based on the number of books entered and whether
the user has a coupon
 */
package cpsc.pkg223j.p3.p3;
import java.util.*;

/*Billing Class
Purpose: Using 3 different methods
we compute the method based on user input
of our book or books*/
class Billing{
    /*Compute Bill
    This method is used to return the price of
    the purchase of 1 book only*/
    double computeBill(double price){
        double tax = price * 0.08;
        return price + tax;
    }
    //This method is used to compute the price of more than 1 book
    double computeBill(double price, int quantity){
        double tax = price * quantity * 0.08;
        return price * quantity + tax;
    }
    //This method is used to compute the price that includes a coupon
    //In the sale
    double computeBill(double price, int quantity, double coupon){
        double red = price * quantity * coupon; //This is simply the reduced sum
        double tax = ((price * quantity) - red) * 0.08;
        return ((price * quantity) - red) + tax;
    }
}
public class Part3 {
    public static void main(String[] args) {
        //Variable Declaration
        Billing b = new Billing(); //Object b of our billing class
        Scanner read = new Scanner(System.in);
        int quantity; //Number of books
        double price; //Price of each book
        double coupon;//Amount the coupon offers
        char hasCoupon;// Confirms if they have a coupon or not
        double bill = 0; //This gets our total amount for the bill
        char c;
        do{
        //Prompt for the number of books
        System.out.print("Enter the number of books: "); 
        quantity = read.nextInt();
        /*This is used to seprate what operation to use depending on quantity
        if its 1, we only want the price of the book, if its more we want
        the price of all the books together*/
        if(quantity == 1){
            //Prompt for more information
            System.out.print("Enter the price of the book: ");
            price = read.nextDouble();
            System.out.print("Any coupon(y/n) ");
            hasCoupon = read.next().charAt(0);
            String temp = read.nextLine();
            //If they have a coupon compute ask for that as well, then compute
            //the price
            if(hasCoupon == 'y' || hasCoupon == 'Y'){
                System.out.print("  How much? ");
                coupon = read.nextDouble();
                bill = b.computeBill(price,quantity,coupon);
            }
            else{
                //Just compute the price after getting it
               bill = b.computeBill(price);
            }
        }
        //Litereally the same as above, only difference being the method 
        else{
            System.out.print("Enter the price of the book: ");
            price = read.nextDouble();
            System.out.print("Any coupon(y/n) ");
            hasCoupon = read.next().charAt(0);
            String temp = read.nextLine();
            if(hasCoupon == 'y' || hasCoupon == 'Y'){
                System.out.print("  How much? ");
                coupon = read.nextDouble();
                bill = b.computeBill(price,quantity,coupon);
            }
            else{
               bill = b.computeBill(price,quantity);
            }
        }
        //Output our total pay
        System.out.printf("\tYour Total pay is %.2f\n",bill);
        System.out.print("Continue(y/n)? ");
        c = read.next().charAt(0);
        String temp = read.nextLine();
    }while(c == 'y' || c == 'Y');
}
