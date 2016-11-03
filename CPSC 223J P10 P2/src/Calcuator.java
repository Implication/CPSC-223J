/*Trajon Felton
 * Vincent Campbell
 * 
 * Ray Almedia
 * CPSC 223J Project 10 Part 2
 * Due: November 3, 2016
 * Purpose: Create a app that acts like a calculator
 */

import javax.swing.*;
import javax.swing.event.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;


public class Calcuator extends Applet implements ActionListener {
	Button
		oneBtn = new Button("1"),
		twoBtn = new Button("2"),
		threeBtn = new Button("3"),
		fourBtn = new Button("4"),
		fiveBtn = new Button("5"),
		sixBtn = new Button("6"),
		sevenBtn = new Button("7"),
		eightBtn = new Button("8"),
		nineBtn = new Button("9"),
		zeroBtn = new Button("0"),
		addBtn = new Button("+"),
		eqBtn = new Button("="),
		clearBtn = new Button("CLEAR"),
		signBtn = new Button("+/-"),
		factoralBtn = new Button("n!"),
		divideBtn = new Button("/"),
		subtractBtn = new Button("-"),
		multiplyBtn = new Button("*");
	TextField
		txtWin=new TextField();
	String n = " ", n1st, n2st, op;
	boolean sign = false;
	int n1, n2;
	
	public void init(){
		setLayout(null);
		setSize(250,500);
		txtWin.setBounds(10,10,230,50);	add(txtWin);
		sevenBtn.setBounds(10,90,40,35); add(sevenBtn);
		eightBtn.setBounds(75,90,40,35 ); add(eightBtn);
		nineBtn.setBounds(140,90,40,35); add(nineBtn);
		addBtn.setBounds(200,90,40,35 ); add(addBtn);
		fourBtn.setBounds(10,170,40,35); add(fourBtn);
		fiveBtn.setBounds(75,170,40,35 ); add(fiveBtn);
		sixBtn.setBounds(140,170,40,35); add(sixBtn);
		subtractBtn.setBounds(200,170,40,35 ); add(subtractBtn);
		oneBtn.setBounds(10,250,40,35); add(oneBtn);
		twoBtn.setBounds(75,250,40,35 ); add(twoBtn);
		threeBtn.setBounds(140,250,40,35); add(threeBtn);
		multiplyBtn.setBounds(200,250,40,35 ); add(multiplyBtn);
		zeroBtn.setBounds(10,330,40,35); add(zeroBtn);
		eqBtn.setBounds(75,330,105,35); add(eqBtn);
		divideBtn.setBounds(200,330,40,35); add(divideBtn);
		signBtn.setBounds(10,410,40,35); add(signBtn);
		clearBtn.setBounds(75,410,105,35); add(clearBtn);
		factoralBtn.setBounds(200,410,40,35); add(factoralBtn);
		
		oneBtn.addActionListener(this);
		twoBtn.addActionListener(this);
		threeBtn.addActionListener(this);
		fourBtn.addActionListener(this);
		fiveBtn.addActionListener(this);
		sixBtn.addActionListener(this);
		sevenBtn.addActionListener(this);
		eightBtn.addActionListener(this);
		nineBtn.addActionListener(this);
		zeroBtn.addActionListener(this);
		addBtn.addActionListener(this);
		eqBtn.addActionListener(this);
		clearBtn.addActionListener(this);
		factoralBtn.addActionListener(this);
		divideBtn.addActionListener(this);
		subtractBtn.addActionListener(this);
		multiplyBtn.addActionListener(this);
		signBtn.addActionListener(this);
	}
	
	
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == oneBtn){
			n += "1"; txtWin.setText(n); }
		else if(e.getSource() == twoBtn){
			n += "2"; txtWin.setText(n);}
		else if(e.getSource() == threeBtn){
			n += "3"; txtWin.setText(n);}
		else if(e.getSource() == fourBtn){
			n += "4"; txtWin.setText(n);}
		else if(e.getSource() == fiveBtn){
			n += "5"; txtWin.setText(n);}
		else if(e.getSource() == sixBtn){
			n += "6"; txtWin.setText(n);}
		else if(e.getSource() == sevenBtn){
			n += "7"; txtWin.setText(n);}
		else if(e.getSource() == eightBtn){
			n += "8"; txtWin.setText(n);}
		else if(e.getSource() == nineBtn){
			n += "9"; txtWin.setText(n);}
		
		else if(e.getSource()==addBtn)
		{n = txtWin.getText().trim();
			n1=Integer.parseInt(n); n =" "; txtWin.setText(" ");
			op = "+";
			if(sign)
				n1 *= -1;
			sign = false;
			txtWin.requestFocus();
		}
		else if(e.getSource()==subtractBtn)
		{n = txtWin.getText().trim();
			n1=Integer.parseInt(n); n =" "; txtWin.setText(" ");
			op = "-";
			if(sign)
				n1 *= -1;
			sign = false;
			txtWin.requestFocus();
		}
		else if(e.getSource()==multiplyBtn)
		{n = txtWin.getText().trim();
			n1=Integer.parseInt(n); n =" "; txtWin.setText(" ");
			op = "*";
			if(sign)
				n1 *= -1;
			sign = false;
			txtWin.requestFocus();
		}
		else if(e.getSource()==divideBtn)
		{n = txtWin.getText().trim();
			n1=Integer.parseInt(n); n =" "; txtWin.setText(" ");
			op = "+";
			if(sign)
				n1 *= -1;
			sign = false;
			txtWin.requestFocus();
		}
		
		else if(e.getSource()==eqBtn)
		{
			n = txtWin.getText().trim();
			n2=Integer.parseInt(n); n=" ";
			n1st = Integer.toString(n1);
			n2st = Integer.toString(n2);
			if(sign)
				n2 *= -1;
			
			if(op == "+")
				txtWin.setText(n1st + op + n2st + "=" + Integer.toString(n1 + n2));
			else if(op == "-")
				txtWin.setText(n1st + op + n2st + "=" + Integer.toString(n1 - n2));
			else if(op == "*")
				txtWin.setText(n1st + op + n2st + "=" + Integer.toString(n1 * n2));
			else
				txtWin.setText(n1st + op + n2st + "=" + Integer.toString(n1 / n2));
		}
		
		else if(e.getSource()==factoralBtn)
		{
			n = txtWin.getText().trim();
			n1 = Integer.parseInt(n); n = " ";
			int x = 1;
			n1st=Integer.toString(n1);
			n2 = 1;
			while(x != n1){
				n2 *= (x + 1);
				x++;
			}
			txtWin.setText(n1st + "!" + "=" + Integer.toString(n2));
		}
		
		else if(e.getSource()==signBtn){
			if(!sign)
				sign = true;
			else
				sign = false;
		}
		else{
			txtWin.setText(" "); n = " ";
			txtWin.requestFocus();
		}
	}
	
}
