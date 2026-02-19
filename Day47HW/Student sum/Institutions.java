
package innerclass;
import java.util.Scanner;

 class Institutions
{
    String institutionName="ABC institutions";
    
    {
        this.institutionName=institutionName;
    }
    class Student
     {
        String studentName;
        int rollno;
        int[] marks;
        double average;
        String grade;
        Student()
        {
            System.out.println("Student object is created");
        }
        
     
     void addStudent(String name, int roll,int count)
      {
        studentName=name;
        rollno=roll;
        marks=new int[count];
      }
      void addMarks()
      {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the marks");
          for (int i = 0; i < marks.length; i++) 
          {
              marks[i]=sc.nextInt();
          }
          
      }
      void calculateGrade()
      {
          int total=0;
          for(int i=0;i<marks.length;i++)
          {
             total=total+marks[i];
          }
          average=(double) total/marks.length;
          if(average>=90)
          {
              grade="A";
          }
          else if(average>=75)
          {
              grade="B";
          }
          else if(average>=50)
          {
              grade="C";
          }
          else
          {
              grade="fail";
          }
      }
      void display()
      {
          System.out.println("\n Institution name:"+institutionName);
          System.out.println("StudentName:"+studentName);
          System.out.println("RollNo:"+rollno);
          System.out.println("Marks");
          for(int m:marks)
          {
              System.out.println(m+" ");
          }
          System.out.println("Average:"+average);
          System.out.println("grade:"+grade);
      }
    }
}

    
   
    
  
   

