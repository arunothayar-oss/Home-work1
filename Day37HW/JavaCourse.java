
package encapsulation;


public class JavaCourse extends Course
{

    public JavaCourse(String courseName) 
    {
        super(courseName);
    }
    @Override
    void joinCourse(Student student)
    {
        System.out.println(student.getName()+"joined"+courseName);
        
    }
    
}
