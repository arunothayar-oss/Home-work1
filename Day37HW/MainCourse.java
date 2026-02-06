
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
