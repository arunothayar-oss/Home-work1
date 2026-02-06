
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

    