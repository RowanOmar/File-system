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
public class createsub extends JPanel{

    public Filesys filee;
    JTextField text1;
    JLabel label1;
    JTextField text2;
    JLabel label2;
     JTextField text3;
    JLabel label3;
    JButton button1;
    public createsub() {
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
        
        label2=new JLabel("Sub1 name");
        text2=new JTextField("");
        label2.setBounds(20, 90, 300, 30);
        text2.setBounds(20, 130, 150, 30);
        add(label2);
                add(text2);

        
        
         label3=new JLabel("sub2 name");
        text3=new JTextField("");
        label3.setBounds(20, 170, 150, 30);
        text3.setBounds(20, 200, 150, 30);
        add(label3);
        add(text3); 
        
        
        button1=new JButton("Create");
        button1.setBounds(20, 240, 150, 30);
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
                String dirc=text1.getText();
                String sub1n=text2.getText();
                String sub2n=text3.getText();
                
                filee.createsubdirectories(dirc,sub1n,sub2n);
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

