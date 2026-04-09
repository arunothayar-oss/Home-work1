
package COPackage;
import java.util.Scanner;

public class MainInput 
{

   
    public static void main(String[] args) throws Exception
    {
       Scanner sc = new Scanner(System.in);
        ServiceCO s = new ServiceCO();

        System.out.println("1. Insert Customers");
        System.out.println("2. Insert Orders");
        System.out.println("3. Display Filtered Data");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch(choice)
        {
            case 1:
                System.out.print("How many customers? ");
                int n = sc.nextInt();

                for(int i=1; i<=n; i++)
                {
                    System.out.println("Enter Customer " + i);

                    System.out.print("Customer ID: ");
                    int cid = sc.nextInt();

                    System.out.print("Name: ");
                    String name = sc.next();

                    System.out.print("City: ");
                    String city = sc.next();

                    System.out.print("Grade: ");
                    int grade = sc.nextInt();

                    System.out.print("Salesman ID: ");
                    int sid = sc.nextInt();

                    CustomerModel c = new CustomerModel(cid, name, city, grade, sid);
                    s.addCustomer(c);
                }
                break;

            case 2:
                System.out.print("How many orders? ");
                int m = sc.nextInt();

                for(int i=1; i<=m; i++)
                {
                    System.out.println("Enter Order " + i);

                    System.out.print("Order No: ");
                    int ordNo = sc.nextInt();

                    System.out.print("Amount: ");
                    double amt = sc.nextDouble();

                    System.out.print("Date (yyyy-mm-dd): ");
                    String date = sc.next();

                    System.out.print("Customer ID: ");
                    int cid = sc.nextInt();

                    System.out.print("Salesman ID: ");
                    int sid = sc.nextInt();

                    OrdersModel o = new OrdersModel(ordNo, amt, date, cid, sid);
                    s.addOrder(o);
                }
                break;

            case 3:
                System.out.print("Enter Min Amount: ");
                double min = sc.nextDouble();

                System.out.print("Enter Max Amount: ");
                double max = sc.nextDouble();

                s.showFiltered(min, max);
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}
    
    
