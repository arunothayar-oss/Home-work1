
package doublylinkedlistinsertion;


public class Doubly 
{
    Node head;
    Node tail;
    void insertionAtEnd(int data)
    {
        Node n=new Node(data);
        if(head==null)
        {
            head=n;
            tail=n;
            return;
        }
        tail.next=n;
        n.previous=tail;
        tail=n;
     }
    void insertionAtPosition(int data,int position)
    {
        Node n=new Node(data);
        if(head==null)
        {
            head=n;
            tail=n;
            return;
        }
        if(position==1)
        {
            n.next=head;
            head.previous=n;
            head=n;
            return;
        }
        Node temp=head;
        int count=1;
        while(temp!=null&&count<position-1)
        {
            temp=temp.next;
            count++;
        }
        if(temp==null)
        {
            System.out.println("Invalid position");
            return;
        }
        n.next=temp.next;
        n.previous=temp;
        temp.next.previous=n;
        temp.next=n;
     }
    void display()
    {
        Node temp=head;
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
            
        }
    
    }
   
    
}
