
package MobileShopManagementSystem;


public class MobileShop
{
    Node head;
    void insertAtHead( String brandName,int mobileId, double price)
    {     
        Node n=new Node(brandName,mobileId,price);
        if(head==null)
        {
            
            head=n;
            return;
        }
        
        System.out.println("iphone Mobile launches Successfully");
    }
    void insertAtTail(String brandName,int mobileId, double price )
    {
        Node n=new Node(brandName,mobileId,price);
        if(head==null)
        {
            
            head=n;
            return;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=n;
        System.out.println("Regular stock mobile launch successfully");
    }
    
    void display()
    {
        
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        Node temp=head;
        while(temp!=null)
        {
            System.out.println("MobileId:"+temp.mobileId);
            System.out.println("Brand Name:"+temp.brandName);
            System.out.println("Price:"+temp.price);
            System.out.println("------------");
            temp=temp.next;
        }
        
    }
}
