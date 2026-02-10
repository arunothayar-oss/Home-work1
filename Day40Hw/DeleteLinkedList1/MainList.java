
package DeleteLinkedList1;
import java.util.Scanner;

public class MainList
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        SingulyDelete1 sd=new SingulyDelete1();
        int choice;
        do
        {
            
            System.out.println("1.Insertion");
            System.out.println("2.Deletion");
            System.out.println("3.Exit");
            System.out.println("Enter your choice");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                {
                    System.out.println("Enter the number:");
                    int number=sc.nextInt();
                    sd.insertList(number);
                    sd.print();
                    System.out.println("After insertion");
                    break;
                }
                case 2:
                {
                    System.out.println("Enter the key value:");
                    int keyValue=sc.nextInt();
                    sd.deleteValue(keyValue);
                    sd.print();
                    System.out.println("After deletion");
                    break;
                }
                case 3:
                {
                    break;
                }
            }
        }while(choice!=3);
    
    }
}



/*  Singly Linked List
Insertion: 25, 32, 45, 6, 24, 52
Deletion: (example - 6)
Finally display the Elements

Problem Statement (Exam-friendly)

Write a Java program to insert elements into a singly linked list,
delete a given element, and display the final linked list.

Input elements:
25, 32, 45, 6, 24, 52


Element to delete:
6   */

