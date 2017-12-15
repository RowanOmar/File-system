/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfilesystem;
//import java.awt.*;
//import java.awt.List;

import java.awt.Font;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
//import java.util.*;
import java.nio.file.FileSystem;
import java.util.List;


/**
 *
 * @author Rawan
 */
public class readfromfile extends JPanel{

    public Filesys filee;
    JTextField text1;
    JLabel label1;
    JLabel label2;
    JButton button1;
    List<String>array;
    public readfromfile() {
        myhandeler hand=new myhandeler();
        Font f1 = new Font("SansSerif", Font.BOLD, 12);
        setLayout(null);
        filee=new Filesys();
        label1=new JLabel("file name : ");
        text1=new JTextField("");
        label1.setBounds(20, 10, 150, 30);
        text1.setBounds(20, 50, 150, 30);
        add(label1);
        add(text1);   
        button1=new JButton("read");
        button1.setBounds(20, 90, 150, 30);
        add(button1);
        button1.addActionListener(hand);
        label2=new JLabel();
        label2.setBounds(30, 130, 150, 40);
        add(label2);
        
       
        
        
        
    }
    private class myhandeler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
        
        Object pressed=e.getSource();
            try{
            if(pressed.equals(button1))
            {
                String t=text1.getText();
                
                
                       array=filee.read(t);
                       for(String d:array)
                       {
                           label2.setText(d);
                       }
                           
                    
                
                JOptionPane.showMessageDialog(null, "Done successfully");
            }
            }
             catch(Exception error)
       {
           JOptionPane.showMessageDialog(null, "error", "error",JOptionPane.ERROR_MESSAGE);
           System.exit(0);
       }
            }
    
}
}
