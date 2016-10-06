/*
	Trajon Felton
	Ray Almedia
	Project 7 Question 1
	Due: Thursday October 13, 2016
	Purpose: Given 2 ordered linked list create a new ordered linked list
	that is the union of the 2 sets
*/

import java.util.*;

class node{
	int info;
	node next;
	public node(int val)
	{info = val; next = null;
	}
}


class Dcoder{
	node ordered;
	Dcoder(){
		ordered = null;
	}
	public void insertOrdered(int val){
		node temp = new node(val);
		node p, q; p = q = ordered;
		while(p != null && p.info < val){
			q = p; p = p.next;
		}
		if(p == ordered){
			temp.next = p;
			ordered = temp;
		}
		else if(p == null){
			q.next = temp;
		}
		else{
			temp.next = p;
			q.next = temp;
		}
	}
	public void display(node p){
		while(p != null){
			System.out.print(p.info + "->");
			p = p.next;
		}
		System.out.println("null");
	}
	public static void main(String args[]){
		Scanner read = new Scanner(System.in);
		Dcoder setA = new Dcoder();
		Dcoder setB = new Dcoder();
		Dcoder setAUB = new Dcoder();
		int num[] = new int[5];
		System.out.print("Enter 5 integer numbers: ");
		for(int i = 0; i < 5; i++){
			num[i] = read.nextInt();
			setA.insertOrdered(num[i]);
			System.out.print(num[i] + " ");
		}
		System.out.println();
		System.out.print("Enter 5 more integer numbers");
		for(int i = 0; i < 5; i++){
			num[i] = read.nextInt();
			setB.insertOrdered(num[i]);
			System.out.print(num[i] + " ");
			}
		System.out.println();
		node a = setA.ordered;
		node b = setB.ordered;
		boolean duplicate = false;
		while(a != null){
			node temp = setAUB.ordered;
			while(temp != null){
				if(temp.info == a.info){
					duplicate = true;
					break;
				}
				else{
					temp = temp.next;
				}
			}
			if(!duplicate){
			setAUB.insertOrdered(a.info);
			a = a.next;
			}
		}
			while(b != null){
			node temp = setAUB.ordered;
			while(temp != null){
				if(temp.info == b.info){
					duplicate = true;
					break;
				}
				else{
					temp = temp.next;
				}
			}
			if(!duplicate){
			setAUB.insertOrdered(b.info);
			b = b.next;
			}
		}
		setA.display(setA.ordered);
		setB.display(setB.ordered);
		setAUB.display(setAUB.ordered);
	}
}