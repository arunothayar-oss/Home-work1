
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
/*    Create a console-based Java application to manage student academic details using an Inner Class and Array.
Requirements:
Create an outer class named Institution
Variable: institutionName
Inside the Institution class, create an inner class named Student
Variables:
studentName
rollNo
int[] marks (Array for storing subject marks)
average
grade
The program should:
Ask the user to enter:
Student name
Roll number
Number of subjects
Dynamically create an array for marks based on subject count
Accept marks using loop
Calculate average
Assign grade using conditions:
90 and above → Grade A
75 to 89 → Grade B
50 to 74 → Grade C
Below 50 → Fail
Display full student details
Implement the program using a Menu Driven System:
Copy code

1. Add Student
2. Add Marks
3. Calculate Grade
4. Display Student Details
5. Exit
Sample Input
Copy code

Enter Student Name: Arun
Enter Roll No: 101
Enter Number of Subjects: 3

Enter Marks:
78
85
90
Expected Output
Copy code

Institution Name: ABC Institution
Student Name: Arun
Roll No: 101
Marks: 78 85 90
Average: 84.33
Grade: B    */

