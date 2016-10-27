/*
 Trajon Felton
Vince Campbell
* Ray Almedia
 * CPSC 223J Project 8 Part 2
 * Due: October 20, 2016
 * Purpose: Given a data file of customers, this will display all of the customers in the bank, deposit
 * an amount into the bank and allow a withdraw into the bank.
 */


import java.util.*;
import java.io.*;

class Customer {
	int ID;
	String name;
	double balance;

	Customer(int i, String n, double b) {
		ID = i;
		name = n;
		balance = b;
	}

	int getID() {
		return ID;
	};

	String getName() {
		return name;
	}

	double getBalance() {
		return balance;
	};
	
	void setBalance(double b){
		balance = b;
	}
}

class node {
	Customer info;
	node left;
	node right;

	node(Customer val) {
		info = val;
		left = null;
		right = null;
	}
}

public class BST {
	node root;

	public BST() {
		root = null;
	}

	public void insert(Customer val) {
		node p = new node(val);
		if (root == null) {
			root = p;
			return;
		} else {
			node current = root;
			node parent = null;
			while (true) {
				parent = current;
				if (val.getID() < current.info.getID()) {
					current = current.left;
					if (current == null) {
						parent.left = p;
						return;
					}
				} else {
					current = current.right;
					if (current == null) {
						parent.right = p;
						return;
					}
				}
			}
		} // end of while
	}// end of insert

	node search(int val) {
		if (root == null) {
			System.out.println("Currently empty");
			return root;
		}
		
		if(root.info.getID() == val){
			return root;
		}
		else {
			node current = root;
			while (true) {
				if (val < current.info.getID()) {
					current = current.left;
					if (current == null) {
						System.out.println("ID Does not exist");
						return null;
					}
					if (current.info.getID() == val) {
						return current;
					}
				} else {
					current = current.right;
					if (current == null) {
						System.out.println("ID Does not exist");
						return null;
					}
					if (current.info.getID() == val) {
						return current;
					}
				}
			}//end of while
		}//end of else
	}//end of search
	
	public static  void displayCustomerBalance(node v){
		System.out.println("Hello  " + v.info.getName() + ", you have a current balance of $" + v.info.getBalance() );
	}
	
	public static  void deposit(node v){
		Scanner read = new Scanner(System.in);
		System.out.print(v.info.getName() + ", how much would you like to deposit? ");
		double d = read.nextDouble();
		v.info.setBalance(v.info.getBalance() + d);
		System.out.println(v.info.getName() + " you now have a balnace of $" + v.info.getBalance());
	}
	
	public static void withdraw(node v){
		Scanner read = new Scanner(System.in);
		System.out.print(v.info.getName() + ", how much would you like to withdraw? ");
		double d = read.nextDouble();
		v.info.setBalance(v.info.getBalance() - d);
		System.out.println(v.info.getName() + " you now have a balnace of $" + v.info.getBalance());
	}

	public void displayTreeInorder(node P) {
		if (P != null) {
			displayTreeInorder(P.left);
			System.out.println(P.info.getID() + " " + P.info.getName() + " $" + P.info.getBalance());
			displayTreeInorder(P.right);
		}
	}
	
	public static void copy(String fname, BST list) throws IOException{
		BufferedReader in = new BufferedReader(new FileReader(fname));
		String line;
		Customer val;
		while((line = in.readLine()) != null){
			String token[] = line.split(" ", 3);
			val = new Customer(Integer.parseInt(token[0]), token[1] , Double.parseDouble(token[2]));
			list.insert(val);
		}
	}

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		char choice;
		BST list = new BST();
		try{
		copy("C:\\Users\\Trajon Felton\\Desktop\\data.txt", list);
		}catch(IOException x){ x.getMessage(); }
		
		do{
		list.displayTreeInorder(list.root);
		System.out.println("\n----------MENU----------");
		System.out.println("a. Enter ID number to deposit");
		System.out.println("b. Enter ID to withdraw");
		System.out.println("c. Enter ID to see balance");
		System.out.println("d. Exit");
		System.out.print("\nEnter your choice: ");
		choice = read.next().charAt(0);
		int i;
		node value;
		switch(choice){
		case 'a':
			System.out.print("Enter your ID Number: ");
			i = read.nextInt();
			value = list.search(i);
			if(value != null)
				deposit(value);
			break;
		case 'b':
			System.out.print("Enter your ID Number: ");
			i = read.nextInt();
			value = list.search(i);
			if(value != null)
				withdraw(value);
			break;
		case 'c':
			System.out.print("Enter your ID Number: ");
			i = read.nextInt();
			value = list.search(i);
			if(value != null)
				displayCustomerBalance(value);
			break;
		case 'd':
			System.out.print("Exiting Program...");
			break;
		default:
			break;
		}
	}while(choice != 'd' && choice != 'D');
}
}
