/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example;

import java.io.*;
public class Example {

    public static void main(String[] args) {
        try{
        display("C:\\Users\\TraFe\\Desktop\\Yoo.txt");
        }
        catch (IOException e) {System.out.print(e.getMessage());
        }
        try{
        copy("C:\\Users\\TraFe\\Desktop\\Yoo.txt", "C:\\Users\\TraFe\\Desktop\\Yoo2.txt");
        } catch (IOException e) {System.out.print(e.getMessage());
        }
        try {
        display("C:\\Users\\TraFe\\Desktop\\Yoo2.txt");
        } catch (IOException e) {System.out.print(e.getMessage());
        }
    }
    public static void display(String fname) throws IOException
    {
        //open the file to rea dform
        BufferedReader in = new BufferedReader(new FileReader(fname));
        try{
            String line;
            while ((line = in.readLine()) != null){
                String token[] = line.split(" ");
                System.out.println(token[0] + "\t" + token[1]);
            }
            in.close();
        }
        catch (Exception ex) {System.out.println("File not found");
    }
    }
    public static void copy(String fname, String fname2) throws IOException
    {
        BufferedReader in = new BufferedReader(new FileReader(fname));
        BufferedWriter out = new BufferedWriter(new FileWriter(fname2));
        String line;
        while ((line = in.readLine()) != null){
            out.write(line); out.newLine(); 
            
        }
        in.close(); out.close();
    }
}
