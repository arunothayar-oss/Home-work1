
package DeleteLinkedList1;


public class SingulyDelete1 
{
   Node1 head;
   void insertList(int data)
   {
       Node1 n=new Node1( data);
       if (head==null)
       {
           head=n;
           return;
       }
       Node1 temp=head;
       while(temp.next!=null)
       {
           temp=temp.next;
       }
       temp.next= n;
   }
   void deleteValue(int value)
   {
       if(head==null)
       {
           System.out.println("The list is empty");
           return;
       }
       if(head.data==value)
       {
           head=head.next;
           return;
       }
       Node1 temp=head;
       while(temp.next!=null&&temp.next.data!=value)
       {
           temp=temp.next;
       }
       temp.next=temp.next.next;
       if(temp.next==null)
       {
           System.out.println("Key value not found");
           return;
       }
       
   }
       void print()
       {
            Node1 temp=head;
           if(head==null)
        {
           System.out.println("The list is empty");
           return;
        }
           while(temp!=null)
           {
               System.out.print(temp.data+" ");
               temp=temp.next;
               System.out.println("");
           }
       
       }
       
       
   
   }
