/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfilesystem;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Rawan
 */
public class seek extends JPanel{ 
    public Filesys filee;
    JTextField text1;
    JLabel label1;
    JTextField text2;
    JLabel label2;
    JLabel label3;
    JButton button1;
    HashMap hm=new HashMap();
    public seek() {
        myhandeler hand=new myhandeler();
        Font f1 = new Font("SansSerif", Font.BOLD, 12);
        setLayout(null);
        filee=new Filesys();
        label1=new JLabel("File name : ");
        text1=new JTextField("");
        label1.setBounds(20, 10, 350, 30);
        text1.setBounds(20, 50, 150, 30);
        add(label1);
        add(text1);   
        
        label2=new JLabel("Enter text you want to seek for: ");
        text2=new JTextField("");
        label2.setBounds(20, 90, 350, 30);
        text2.setBounds(20, 130, 150, 30);
        add(label2);
        add(text2); 
        
        
        button1=new JButton("Seek");
        button1.setBounds(20, 170, 150, 30);
        add(button1);
        button1.addActionListener(hand);
        
         label3=new JLabel();
        label3.setBounds(30, 210, 350, 40);
        add(label3);
        
       
    }
    private class myhandeler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
        
        Object pressed=e.getSource();
            try{
            if(pressed.equals(button1))
            {
                String filename=text1.getText();
                String content=text2.getText();
                
                hm=filee.seek(filename,content);
                 Set set = hm.entrySet();
      
     
                Iterator i = set.iterator();
                while(i.hasNext()){
                Map.Entry me = (Map.Entry)i.next();
                
                label3.setText("Found"+" "+me.getValue()+" "+"in file"+" "+filename+"  in line "+me.getKey());
                
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
