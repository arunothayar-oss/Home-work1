
package filehandling;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
        
public class FileDisplaySum 
{


    
    public static void main(String[] args)
    {
       int sum=0;
       try
       {
           File fi=new File("F:\\numbers.txt");
           if(fi.createNewFile())
           {
               System.out.println("file is created");
           }
           else
           {
               System.out.println("file already exists");
           }
           FileWriter fw=new FileWriter(fi);
           fw.write("10\n");
           fw.write("20\n");
           fw.write("30\n");
           fw.write("40\n");
           fw.close();
           System.out.println("numbers written in file");
           
           System.out.println(sum);
       }
           
           catch(IOException e)
           {
               System.out.println("Error get message"+e.getMessage());     
           }
           
       
        
    }
    
}
