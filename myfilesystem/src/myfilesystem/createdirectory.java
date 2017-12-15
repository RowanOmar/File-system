/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfilesystem;
import java.awt.*;
import java.awt.event.*;
import java.io.Serializable;
import javax.swing.*;
import java.util.*;


/**
 *
 * @author Rawan
 */
public class createdirectory extends JPanel{

    public Filesys filee;
    JTextField text1;
    JLabel label1;
    JButton button1;
    public createdirectory() {
        myhandeler hand=new myhandeler();
        Font f1 = new Font("SansSerif", Font.BOLD, 12);
        setLayout(null);
        filee=new Filesys();
        label1=new JLabel("Directory name : ");
        text1=new JTextField("");
        label1.setBounds(20, 10, 150, 30);
        text1.setBounds(20, 50, 150, 30);
        add(label1);
        add(text1);   
        button1=new JButton("create");
        button1.setBounds(20, 90, 150, 30);
        add(button1);
        button1.addActionListener(hand);
        
        
        
        
    }
    private class myhandeler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
        
        Object pressed=e.getSource();
            try{
            if(pressed.equals(button1))
            {
                String t=text1.getText();
                
                filee.createdirectories(t);
                JOptionPane.showMessageDialog(null, "Directory is created successfully");
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
