
package encapsulation;
import java.util.Scanner;

public class MainCourse 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Student id:");
        int id =sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Student Name:");
        String name=sc.nextLine();
        Student student=new Student(id,name);
        System.out.println("Enter the course name");
        String courseName=sc.nextLine();
        sc.nextLine();
        JavaCourse jo =new JavaCourse("JavaCourse");
        jo.joinCourse(student);
        
    }
}


       /*Create a POJO class Student
Private variables: id, name
Constructor to initialize values
Getter methods to access the data
Create an abstract class Course
Protected variable: courseName
Constructor to initialize course name
Abstract method joinCourse(Student student)
Create a child class JavaCourse
Inherit from Course
Implement the joinCourse() method
Print the student name and course name
Create a Main class
Create objects for Student and JavaCourse
Call the joinCourse() method
Display output in console
🔹 Sample Output:
Copy code

Ravi joined Java course
🔹 Note:
Use proper access modifiers
Follow encapsulation principles
Do not use advanced concepts like collections or files */
