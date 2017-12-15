/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfilesystem;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Rawan
 */
public class getdefault extends JPanel{ 
    public Filesys filee;
    JTextField text1;
    JButton button1;
    public getdefault() {
        myhandeler hand=new myhandeler();
        Font f1 = new Font("SansSerif", Font.BOLD, 12);
        setLayout(null);
        filee=new Filesys();
        text1=new JTextField("");
        text1.setBounds(20, 70, 250, 250);
        add(text1);
   
        button1=new JButton("Get default");
        button1.setBounds(20, 20, 150, 30);
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
               
                String dat=filee.getdefault();
                text1.setText(dat);
                }
                 
                JOptionPane.showMessageDialog(null, "Done successfully");
            } catch (IOException ex) {
                Logger.getLogger(getdefault.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
     
            }
    
}
    

