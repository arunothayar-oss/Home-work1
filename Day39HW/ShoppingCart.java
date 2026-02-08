
package linkedlist;

public class ShoppingCart
{
  Product head;
    void addProducts(int productId,String productName,double price)
    {
        Product newNode=new Product(productId,productName,price);
        if(head==null)
        {
            head=newNode;
            return;                    
        }
       Product temp=head;
       while(temp.next!=null)
       {
          temp=temp.next;
       }
       temp.next=newNode;
    }
    void viewProducts()
    {   
        Product temp=head;
        
        if(head==null)
        {
            System.out.println("the head is empty");
            return;
        }
        while(temp!=null)
        {
            System.out.println("ProductId:"+temp.productId);
            System.out.println("ProductName:"+temp.productName);
            System.out.println("Product Price:"+temp.price);
            temp=temp.next;
        }
        
    }
}
