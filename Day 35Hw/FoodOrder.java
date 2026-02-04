
package Interface.Order;


public class FoodOrder extends Customer implements Order
{
    String foodItem;
    double price;
    FoodOrder(String customerName,String foodItem, double price)
    {
        super(customerName);
        this.foodItem=foodItem;
        this.price=price;
               
    }
    @Override
     public void placeOrder()
    {
        System.out.println("order placed Successfully ");
    }
    @Override
    public  void showBill()
    {
        System.out.println("BILL DETAILS");
        System.out.println(customerName);
        System.out.println(foodItem);
        System.out.println(price);
        System.out.println("----------------------");
    }
    
}
