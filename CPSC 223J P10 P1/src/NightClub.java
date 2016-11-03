/*Trajon Felton
 * Vincent Campbell
 * 
 * Ray Almedia
 * CPSC 223J Project 10 Part 1
 * Due: November 3, 2016
 * Purpose: Add a name, address and phone number to a list*/

import javax.swing.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;


public class NightClub extends Applet implements ActionListener {
	JLabel
		lblTitle = new JLabel("California Nite Club Check-In"),
		lblName = new JLabel("Name"),
		lblAddress = new JLabel("Address"),
		lblPhnNum = new JLabel("Phone Number");
	TextField
		txtName = new TextField(),
		txtAddress = new TextField(),
		txtPhnNum = new TextField();
	Button
	btnAdd = new Button("Add to the list");
	TextArea
		txtReport = new TextArea("Name\t\tAddress\t\t\t\t\tPhone Number\n",4,60,TextArea.SCROLLBARS_BOTH);
	
	public void init(){
		setLayout(null);
		setSize(500,300);
		lblTitle.setBounds(150,10,180,20);
		add(lblTitle);
		lblName.setBounds(10,60,100,20);		add(lblName);
		txtName.setBounds(120,60,150,20);	add(txtName);
		lblAddress.setBounds(10,90,100,20);	add(lblAddress);
		txtAddress.setBounds(120,90,150,20); add(txtAddress);
		lblPhnNum.setBounds(10,120,100,20);	add(lblPhnNum);
		txtPhnNum.setBounds(120,120,150,20);	add(txtPhnNum);
		btnAdd.setBounds(10,150,120,20);	add(btnAdd);
		txtReport.setBounds(10,180,480,100); add(txtReport);
		btnAdd.addActionListener(this);
		txtName.requestFocus();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String line, strName, strAddress, strPhnNum;
		strName=txtName.getText();
		strAddress=txtAddress.getText();
		strPhnNum=txtPhnNum.getText();
		line=strName+"\t\t"+strAddress+"\t\t\t"+strPhnNum;
		txtReport.append(line+"\n");
		txtName.setText(" ");
		txtAddress.setText(" ");
		txtPhnNum.setText(" ");
		txtName.requestFocus();
	}
}
