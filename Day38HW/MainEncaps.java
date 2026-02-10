
package encapsulation;


public class MainEncaps 
{
    public static void main(String[] args) 
    {
        Person p=new Person();
        p.setName("John");
        p.setAge(21);
        System.out.println("Name:"+p.getName());
        System.out.println("Age:"+p.getAge());
    }
 
}

  /*Your task is to create a Person class in Java that demonstrates encapsulation.
This c 
lass should have two private attributes: name( String ) and age( int ) whose default values should be name as "Geeks" and age as 10.
The class should provide public getter and setter methods to access and modify these private attributes.
Note: In custom test cases Person() should be written first and in setName('name') function write the name is single quotes.

Example:

Input: Funtion calls: [Person(), getName(), setName("John"), setAge(21), getName(), getAge()]
Output: Geeks John 21  
 Program along with      Person.java & Student.java       */


    