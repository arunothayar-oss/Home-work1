
package innerclass;

import java.util.Scanner;
public class StudentMain 
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       
       Institutions.Student student=new Institutions().new Student();
       int choice;
       do
       {
           System.out.println("\n1.Add student name");
           System.out.println("2.Add marks");
           System.out.println("3.calculate grade");
           System.out.println("4.Display");
           System.out.println("5.Exit");
           System.out.println("Enter your choice:");
           choice =sc.nextInt();
           sc.nextLine();
           switch(choice)
           {
               case 1:
               {
                   System.out.println("Enter student name");
                   String name=sc.nextLine();
                   System.out.println("Enter the roll no");
                   int roll=sc.nextInt();
                   System.out.println("Enter the subject count");
                   int count=sc.nextInt();
                   sc.nextLine();
                   student.addStudent(name,roll,count);
                   break;
               }
               case 2:
               {
                   student.addMarks();
                   break;
               }
               case 3:
               {
               student.calculateGrade();
               break;
               }
               case 4:
               {
                   student.display();
                   break;
               }
               case 5:
               {
                   break;
               }
           }
       }while(choice!=5);
    }
         
}
