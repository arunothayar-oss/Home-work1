
package arraylist;

import java.util.ArrayList;
import java.util.Scanner;


public class AcerMain
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Acer> al=new ArrayList();
        int choice;
        do
        {
            System.out.println("\n1 for Entry 2 for Search 3 for exit");
            System.out.println("Enter the choice:");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice)
            {
                case 1:
                {
                    System.out.println("Enter the model:");
                    String model=sc.nextLine();
                    System.out.println("Enter the colour:");
                    String colour=sc.nextLine();
                    System.out.println("is this is rgb keyboard:");
                    boolean rgbKeyboard=sc.nextBoolean();
                    sc.nextLine();
                    System.out.println("Enter the processor:");
                    String processor=sc.nextLine();
                    System.out.println("Enter the price:");
                    double price =sc.nextDouble();
                    sc.nextLine();
                    Acer laptop=new Acer(model,colour,rgbKeyboard,processor,price);
                    al.add(laptop);
                    System.out.println("Laptop added successfully");
                    break;
                }
                case 2:
                {
                    System.out.println("Enter the laptop name");
                    String searchName=sc.nextLine();
                    boolean found=false;
                    for(Acer laptop:al)
                    {
                        if(laptop.model.equalsIgnoreCase(searchName))
                        {
                            laptop.display();
                            found=true;
                            break;
                        }
                     }
                    if(!found)
                    {
                        System.out.println("model not found");
                    }
                    break;
                  }
                case 3:
                {
                    System.out.println("Thank you for shopping");
                    break;
                }
            
            }
        }while(choice!=3);
    }
}
