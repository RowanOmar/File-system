/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfilesystem;

import java.awt.CardLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author Rawan
 */
public class Gui extends JFrame {

  
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;
    JButton button10;
    JButton button11;
    JButton button12;
    JButton button13;
    JButton back1;
    JButton back2;
    JButton back3;
    JButton back4;
    JButton back5;
    JButton back6;
    JButton back7;
    JButton back8;
    JButton back9;
    JButton back10;
    JButton back11;
    JButton back12;
    JButton back13;
    
    append app=new append();
    copyfile cop=new copyfile();
    createdirectory cdirctry=new createdirectory();
    createfile cfile=new createfile();
    deletefile dfile=new deletefile();
    edit ed=new edit();
    movefile mv=new movefile();
    readfromfile read=new readfromfile();
    search sc=new search();
    seek se=new seek();
    writetofile write=new writetofile();
    getdefault get=new getdefault();
    createsub s=new createsub();
    JPanel b1=new JPanel();
    
    JPanel c=new JPanel();
      public Gui() {
          setLayout(null);
          setSize(700,700);
          setTitle("File System");
            c.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        c.setLayout(new CardLayout());
        
        b1.setSize(500, 500);
        b1.setLayout(null);
        app.setSize(700, 700);
        app.setLayout(null);
        cop.setSize(700,700);
        cop.setLayout(null);
        cdirctry.setSize(700, 700);
        cdirctry.setLayout(null);
        cfile.setSize(700, 700);
        cfile.setLayout(null);     
        dfile.setSize(700, 700);
        dfile.setLayout(null);        
        ed.setSize(700, 700);
        ed.setLayout(null);
        mv.setSize(700, 700);
        mv.setLayout(null);
        read.setSize(700, 700);
        read.setLayout(null);       
        sc.setSize(700, 700);
        sc.setLayout(null);      
        se.setSize(700, 700);
        se.setLayout(null);
        write.setSize(700, 700);
        write.setLayout(null);
        
        
        button1=new JButton("Create Directory");
        button1.setBounds(270, 5, 150, 30);
        button1.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                CardLayout cp = (CardLayout) c.getLayout();
                cp.show(c, "12");
            }
        });
        
         button2=new JButton("Get Default Directory");
        button2.setBounds(270, 50, 150, 30);
         button2.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                CardLayout cp = (CardLayout) c.getLayout();
                cp.show(c, "13");
            }
        });
        
         button3=new JButton("Create file");
        button3.setBounds(270, 95, 150, 30);
        button3.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                CardLayout cp = (CardLayout) c.getLayout();
                cp.show(c, "2");
            }
        });
        
        button4=new JButton("Write");
        button4.setBounds(270, 140, 150, 30);
        button4.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                CardLayout cp = (CardLayout) c.getLayout();
                cp.show(c, "9");
            }
        });
        button5=new JButton("Read");
        button5.setBounds(270, 185, 150, 30);
        button5.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                CardLayout cp = (CardLayout) c.getLayout();
                cp.show(c, "6");
            }
        });
        
        button6=new JButton("Delete file");
        button6.setBounds(270, 230, 150, 30);
        button6.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                CardLayout cp = (CardLayout) c.getLayout();
                cp.show(c, "3");
            }
        });
        
        button8=new JButton("Seek file");
        button8.setBounds(270, 275, 150, 30);
        button8.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                CardLayout cp = (CardLayout) c.getLayout();
                cp.show(c, "8");
            }
        });
        
        button9=new JButton("Edit file");
        button9.setBounds(270, 320, 150, 30);
        button9.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                CardLayout cp = (CardLayout) c.getLayout();
                cp.show(c, "4");
            }
        });
        
        button10=new JButton("Search");
        button10.setBounds(270, 365, 150, 30);
        button10.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                CardLayout cp = (CardLayout) c.getLayout();
                cp.show(c, "7");
            }
        });
        
        button11=new JButton("Copy file");
        button11.setBounds(270, 410, 150, 30);
        button11.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                CardLayout cp = (CardLayout) c.getLayout();
                cp.show(c, "10");
            }
        });
        
        button12=new JButton("Move file");
        button12.setBounds(270, 455, 150, 30);
                button12.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                CardLayout cp = (CardLayout) c.getLayout();
                cp.show(c, "5");
            }
        });
        
        
         button7=new JButton("Append");
        button7.setBounds(270, 500, 150, 30);
                button7.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                CardLayout cp = (CardLayout) c.getLayout();
                cp.show(c, "11");
            }
        });
        
                 button13=new JButton("Create Sub Directories");
        button13.setBounds(270, 545, 150, 30);
                button13.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                CardLayout cp = (CardLayout) c.getLayout();
                cp.show(c, "14");
            }
        });
        b1.add(button1);
        b1.add(button2);
        b1.add(button3);
        b1.add(button4);
       b1.add(button5);
       b1. add(button6);
       b1.add(button8);
       b1. add(button9);
      b1.  add(button10);
       b1. add(button11);
        b1.add(button12);
       b1. add(button7);
       b1.add(button13);


        c.add(b1,"1");
        c.add(cfile,"2");
        c.add(dfile,"3"); 
        c.add(ed,"4");
        c.add(mv,"5");
        c.add(read,"6");
        c.add(sc,"7");
        c.add(se,"8");
        c.add(write,"9");
        c.add(cop,"10");
         c.add(app,"11");
         c.add(cdirctry,"12");
        c.add(get,"13"); 
        c.add(s,"14");
         
         
         back1=new JButton("Back");
                back1.setBounds(340, 60, 100, 50);
                 back1.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                CardLayout cp = (CardLayout) c.getLayout();
                cp.show(c, "1");
            }
        });
                 
                          back2=new JButton("Back");
                back2.setBounds(340, 60, 100, 50);
                 back2.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                CardLayout cp = (CardLayout) c.getLayout();
                cp.show(c, "1");
            }
        });
                 
                          back3=new JButton("Back");
                back3.setBounds(340, 60, 100, 50);
                 back3.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                CardLayout cp = (CardLayout) c.getLayout();
                cp.show(c, "1");
            }
        });
                                           back4=new JButton("Back");
                back4.setBounds(340, 60, 100, 50);
                 back4.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                CardLayout cp = (CardLayout) c.getLayout();
                cp.show(c, "1");
            }
        });
                                           back5=new JButton("Back");
                back5.setBounds(340, 60, 100, 50);
                 back5.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                CardLayout cp = (CardLayout) c.getLayout();
                cp.show(c, "1");
            }
        });
                                       back6=new JButton("Back");
                back6.setBounds(340, 60, 100, 50);
                 back6.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                CardLayout cp = (CardLayout) c.getLayout();
                cp.show(c, "1");
            }
        }); 
                 
                                           back7=new JButton("Back");
                back7.setBounds(340, 60, 100, 50);
                 back7.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                CardLayout cp = (CardLayout) c.getLayout();
                cp.show(c, "1");
            }
        });
                 
                                           back8=new JButton("Back");
                back8.setBounds(340, 60, 100, 50);
                 back8.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                CardLayout cp = (CardLayout) c.getLayout();
                cp.show(c, "1");
            }
        });
                 
                                           back9=new JButton("Back");
                back9.setBounds(340, 60, 100, 50);
                 back9.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                CardLayout cp = (CardLayout) c.getLayout();
                cp.show(c, "1");
            }
        });
                                           back10=new JButton("Back");
                back10.setBounds(340, 60, 100, 50);
                 back10.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                CardLayout cp = (CardLayout) c.getLayout();
                cp.show(c, "1");
            }
        });
                                           back11=new JButton("Back");
                back11.setBounds(340, 60, 100, 50);
                 back11.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                CardLayout cp = (CardLayout) c.getLayout();
                cp.show(c, "1");
            }
        });
                                                        back12=new JButton("Back");
                back12.setBounds(340, 60, 100, 50);
                 back12.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                CardLayout cp = (CardLayout) c.getLayout();
                cp.show(c, "1");
            }
        });
                                                                  back13=new JButton("Back");
                back13.setBounds(340, 60, 100, 50);
                 back13.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                CardLayout cp = (CardLayout) c.getLayout();
                cp.show(c, "1");
            }
        });
                 app.add(back1);
                 cop.add(back2);
                 cdirctry.add(back3);
                 cfile.add(back4);
                 dfile.add(back5);
                 ed.add(back6);
                 mv.add(back7);
                 read.add(back8);
                 sc.add(back9);
                  se.add(back10);
                  write.add(back11);
                  get.add(back12);
                  s.add(back13);
                       this.setContentPane(c);

    }
      

}
