

package doublylinkedlistinsertion;
import java.util.Scanner;

public class DoublyMainList 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        
        Doubly d=new Doubly();
        int choice;
        do
        {
            System.out.println("1.Insertion at end");
            System.out.println("2.Insertion at position");
            System.out.println("3.Display");
            System.out.println("4.Exit");
            System.out.println("Enter your choice");
            choice =sc.nextInt();
            switch(choice)
            {
                case 1:
                {
                    System.out.println("Enter the number");
                    int number=sc.nextInt();
                    d.insertionAtEnd(number);
                    d.display();
                    break;
                }
                case 2:
                {
                    System.out.println("Enter the data");
                    int number=sc.nextInt();
                    System.out.println("Enter the position");
                    int position=sc.nextInt();
                    d.insertionAtPosition(number,position);
                    break;
                }
                case 3:
                {
                    d.display();
                    break;
                }
                case 4:
                {
                break;
                }
            }
        }while(choice!=4);
        
    }
   
   
    
}
