 import java.util.Scanner();
public class AreaMain
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int choice;
        do
        {
            System.out.println("Area of circle");
            System.out.println("Area of square");
            System.out.println("Exit");
            System.out.println("Enter your choice");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                {
                    System.out.println("Enter the radius");
                    double radius=sc.nextDouble();
                    circle ci =new circle(radius);
                    double area=ci.calculateArea();
                    System.out.println("Area of circle:"+area);
                    break;
                    
                }
                case 2:
                {
                    System.out.println("Enter the side");
                    double side=sc.nextDouble();
                    Square sq =new Square(side);
                    double area=sq.calculateArea();
                    System.out.println("Area of circle:"+area);
                    break;
                }
                case 3:
                {
                    System.out.println("Thankyou for calculating");
                    break;
                }
                default :
                    System.out.println("invalid choice");
            }
         }while(choice!=3);
    }
}
