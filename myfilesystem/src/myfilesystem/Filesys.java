/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfilesystem;
import java.io.*;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import javax.swing.JFrame;


/**
 *
 * @author CSC
 */
public class Filesys {
    static FileSystem fs;
    public void createdirectories(String dirname)
    {
                File file = new File("C:\\"+dirname);
        if (!file.exists()) {
            if (file.mkdir()) {
                System.out.println("Directory is created!");
            } else {
                System.out.println("Failed to create directory!");
            }
        }
    }
   
    
    public void createsubdirectories(String dirname, String sub1, String sub2)
    {
         File files = new File("C:\\"+dirname+"\\"+sub1+"\\"+sub2);
        if (!files.exists()) {
            if (files.mkdirs()) {
                System.out.println("Multiple directories are created!");
            } else {
                System.out.println("Failed to create multiple directories!");
            }
        }

    }
    
    
    public void getdefaultdirectory()
    {
       Path path = Paths.get("C:\\Directory1\\Sub2\\Sub-Sub2");
        if (!Files.exists(path)) {
        System.out.println("failed to find path");
        }
        else{
              System.out.println(path);
        }
        String workingDir = System.getProperty("user.dir");
	   System.out.println("Current working directory : " + workingDir);
    }
    
    
         public void create(String filename,String directoryname) throws IOException
    {
        File myFile=new File("C://"+directoryname,filename + ".txt");
       
        System.out.println("file created successfully");
        myFile.createNewFile();
        
    }
         public  void write(String name, String content) throws IOException
         {
             Files.write(Paths.get(name),content.getBytes(), StandardOpenOption.CREATE);
             System.out.println("Done successfully!!");
         }
         
         public  List<String> read(String name) throws IOException
         {
             List<String> lines=Files.readAllLines(Paths.get(name));
             return lines;
         }
         public static void append(String name,String content) throws IOException
         {
             Files.write(Paths.get(name), content.getBytes(), StandardOpenOption.APPEND);
              System.out.println("Done successfully!!");
             
         }
         public void deletefile(String name) throws IOException
         {
              Files.delete(Paths.get(name));
              System.out.println("file is deleted successfully!!");
              
         }
         public  HashMap seek(String filename,String word) throws IOException
         {
             String currentline="";            
             List<String> lines=read(filename);
                HashMap hm = new HashMap();
             
             for(String line:lines)
                     {
                         if(line.contains(word))
                         {
                           currentline=line;
                           int index=lines.indexOf(line);
                              hm.put(index, currentline);
                           
                         }                            
                         
                     }return hm;
         }
         
         public  void edit(String filename,String New,String old) throws IOException
         {
             String currentline="";
             
             List<String> lines=read(filename);
             
             for(String line:lines)
                     {
                         if(line.contains(old))
                         {
                           line=New; 
                           write(filename,New);
                         }
                     
                     }
             System.out.println("done successfully");
             
         }
         
         public static String search(String fname,String directory)
         { String f="";
             File dir = new File("c://"+directory);
             FilenameFilter filter = new FilenameFilter() {
         public boolean accept
         (File dir, String name) {
            return name.startsWith(fname);
        }
      };
      String[] filess = dir.list(filter);
      if (filess == null) {
         System.out.println("Either directory does not exist or is not a directory");
      } 
      else {
         for (int i=0; i<filess.length; i++)
         {
            f = filess[i];
            System.out.println(filess[i]);
            
         }
      }
      return f;
   }
         
         public static void copyfile(String source, String destination) throws IOException
         {
             Files.copy(Paths.get(source),Paths.get(destination));
         }
             
         public static void movefile(String fname,String currentdirectory,String todirectory)
         {
             File file =new File("C:\\"+currentdirectory+"\\"+fname+".txt");
             if(
                file.renameTo(new File("C:\\"+todirectory+"\\" + file.getName()))){
    		System.out.println("File is moved successfully!");
    	   }else{
    		System.out.println("File is failed to move!");
    	   }
             
         }
         
         public  String getdefault() throws IOException{
              FileSystem fs = FileSystems.getDefault();
              String desc="";
               String type="";
               String data="";
               long totalspace=0;
               long unallocatedspace=0;
               long availablespace=0;
               for (FileStore store : fs.getFileStores()) {
                         desc = store.toString();
                         type = store.type();
                        totalspace = store.getTotalSpace();
                       unallocatedspace = store.getUnallocatedSpace();
                       availablespace = store.getUsableSpace();
                               data+=desc+" ,total: "+totalspace+"\n , unallocated space: "+unallocatedspace+
                       "\n, Available: "+availablespace+"\n";
               }
      
               String all="";
                 for (Path root : fs.getRootDirectories()) {
                  all+=root.toString();
    }
                 data+=all;
                                return data;
         }

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        Gui gui=new Gui();
         gui.setVisible(true);
         gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                             
                                 

    }     }
       
      
          
        
        // TODO code application logic here

    

