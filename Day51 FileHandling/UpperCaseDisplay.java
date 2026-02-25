
package filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class UpperCaseDisplay 
{
    public static void main(String[] args) 
    {
        try
        {
            File fi=new File("F:\\text.txt");
           if(fi.createNewFile())
           {
               System.out.println("file is created");
           }
           else
           {
               System.out.println("file already exists");
           }
           FileWriter fw=new FileWriter(fi);
           fw.write("Hellow java\n");
           fw.write("Java is uneasy\n");
           fw.write("File Handling\n");
           fw.close();
            System.out.println("written");
            FileReader fr=new FileReader(fi);
           Scanner sc=new Scanner(fr);
           while(sc.hasNext())
           {
               String str=sc.nextLine();
               System.out.println(str);
              
           }
           sc.close();
           File tempFile=new File("F:\\temp.txt");
           FileWriter fwtemp=new FileWriter(tempFile);
           File upperFile=new File("F:\\uppercase.txt");
           upperFile.createNewFile();
           FileWriter fwupper=new FileWriter(upperFile);
           Scanner sc2=new Scanner(fi);
           while(sc2.hasNext())
           {
               String upperLine=sc2.nextLine().toUpperCase();
               System.out.println(upperLine);
               fwtemp.write(upperLine+"\n");
               fwupper.write(upperLine+"\n");
               
           }
           sc2.close();
           fwtemp.close();
           fwupper.close();
           if(fi.delete())
           {
               tempFile.renameTo(fi);
           }
            System.out.println("\n original file updated");
           
           
        }
        catch(IOException e)
           {
               System.out.println("Error get message"+e.getMessage());     
           }
    }
}
