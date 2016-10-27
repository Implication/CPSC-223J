/*
 * Trajon Felton
 * Vincent Campbell
 * 
 * CPSC 223J Project 9 Part 2
 * Ray Almedia
 * Due: 10/27/2016
 * Purpose: Using frames and graphics, calculate the area of the given shape
 * and display the shape along with the entered information in a given menu
 * */

import java.awt.*;
import javax.swing.*;
import java.util.*;


public class GraphicsP2 {
	public static void main(String[] args){
		JFrame frame = new JFrame("Project 2");
		frame.setSize(300, 300);
		frame.setLocation(0, 0);
		frame.setVisible(true);
		
		Container cPane = frame.getContentPane();
		Graphics g = cPane.getGraphics();
		
		String choice;
		do{
			displayMenu(g);
			
			choice = JOptionPane.showInputDialog("Enter option");
			g.clearRect(0, 0, (int)cPane.getSize().getWidth(), (int)cPane.getSize().getHeight());
			if(choice.equals("a")){
				displayTriangle(g);
			}
			else if(choice.equals("b")){
				displayEllipse(g);
			}
			else{
				displayPolygons(g);
			}
			choice = JOptionPane.showInputDialog("Continue(y/n)");
			g.clearRect(0, 0, (int)cPane.getSize().getWidth(), (int)cPane.getSize().getHeight());
		}while(choice.equals("y"));
	}
	
	static void displayMenu(Graphics g){
		g.drawString("-------MENU-------",50,50);
		g.drawString("a. Compute the area of triangles", 50, 70);
		g.drawString("b. Compute the area of ellipse", 50, 90);
		g.drawString("c. Compute the area of polygons", 50, 110);
	}
	
	static void displayTriangle(Graphics g){
		int b, h;
		String temp = JOptionPane.showInputDialog("Enter the base of the triangle");
		b = Integer.parseInt(temp);
		temp = JOptionPane.showInputDialog("Enter the height of the triangle");
		h = Integer.parseInt(temp);
		
		int[] x = {150, 150 - b, 150 + b };
		int[] y = {50, 50 + h, 50 + h };
		g.fillPolygon(x,y,x.length);
		g.drawPolygon(x,y,x.length);
		g.drawString("Base of the triangle" + b, 50, 210);
		g.drawString("Height of the triangle" + h, 50, 230);
		g.drawString("Area = " + (b * h / 2), 50, 250);
	}
	static void displayEllipse(Graphics g){
		int major, minor;
		String temp = JOptionPane.showInputDialog("Enter the length of the major axis");
		major = Integer.parseInt(temp);
		temp = JOptionPane.showInputDialog("Enter the length of the minor axis");
		minor = Integer.parseInt(temp);
		double area = Math.PI * (major/2)*(minor/2);
		minor = Integer.parseInt(temp);
		g.fillOval(major, minor, 100, 100);
		g.drawOval(major, minor, 100, 100);
		
		g.drawString("Major axis: " + major, 50, 210);
		g.drawString("Minor axis: " + minor, 50, 230);
		g.drawString("Area = " + area, 50, 250);
	}
	static void displayPolygons(Graphics g){
		String temp = JOptionPane.showInputDialog("Enter the x coordinates of the polygon");
		int len = 1;
		for(int i = 0; i < temp.length(); i++){
			if(temp.charAt(i) == ' ')
			len++;
		}
		String[] l = temp.split(" ", len);
		int[] x = new int[len];
		temp = JOptionPane.showInputDialog("Enter the y coordinates of the polygon");
		len = 1;
		for(int i = 0; i < temp.length(); i++){
			if(temp.charAt(i) == ' ')
			len++;
		}
		String[] m = temp.split(" ", len);
		
		int[] y = new int[len];
		for(int i = 0; i < len; i++){
			x[i] = Integer.parseInt(l[i]);
			y[i] = Integer.parseInt(m[i]);
		}
		
		g.fillPolygon(x,y,len);
		g.drawPolygon(x,y,len);
		int area = 0;
		int j = len - 1;
		for(int i = 0; i < len; i++){
			area = area + (x[j]+x[i]) * (y[j] - y[i]);
			j = i;
		}
		area = area/2;
		int n = 0;
		g.drawString("X and Y coordinates: ", 50, 210);
		for(int i = 0; i < len; i++){
			g.drawString("(" + x[i] + "," + y[i] + ") ", 50 + n, 230);
			n += 45;
		}
		g.drawString("Area = " + area, 50, 250);
		
	}
}
