/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfilesystem;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Rawan
 */
public class createfile extends JPanel{

    public Filesys filee;
    JTextField text1;
    JLabel label1;
    JTextField text2;
    JLabel label2;
    JButton button1;
    public createfile() {
        myhandeler hand=new myhandeler();
        Font f1 = new Font("SansSerif", Font.BOLD, 12);
        setLayout(null);
        filee=new Filesys();
        label1=new JLabel("File name : ");
        text1=new JTextField("");
        label1.setBounds(20, 10, 150, 30);
        text1.setBounds(20, 50, 150, 30);
        add(label1);
        add(text1);   
        
        label2=new JLabel("Directory name : ");
        text2=new JTextField("");
        label2.setBounds(20, 90, 150, 30);
        text2.setBounds(20, 130, 150, 30);
        add(label2);
        add(text2); 
        
        
        button1=new JButton("create");
        button1.setBounds(20, 170, 150, 30);
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
                String filename=text1.getText();
                String dirname=text2.getText();
                
                filee.create(filename,dirname);
                JOptionPane.showMessageDialog(null, "File is created successfully");
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