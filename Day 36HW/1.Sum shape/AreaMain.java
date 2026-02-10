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


  /*  Write a menu-driven Java console application to calculate the area of different shapes using the following object-oriented concepts:

Requirements:

Create an abstract class named Shape that contains:

A data member to store a value

A constructor to initialize the value

An abstract method calculateArea()

Create two child classes:

Circle – to calculate the area of a circle

Square – to calculate the area of a square

Both classes should inherit the Shape class and override the calculateArea() method.

Create a menu-driven main class that:

Displays options to calculate the area of Circle or Square

Accepts user input using the Scanner class

Uses a loop to repeat the menu until the user chooses Exit

Displays the calculated area in the console

Use the following concepts in the program:

Abstract class

Inheritance

Constructor

Class & Object

Sample Menu :
--- Shape Area Calculator ---
1. Circle
2. Square
3. Exit
Enter your choice:

Sample Input and Output :

Enter your choice: 1
Enter radius: 5
Area of Circle: 78.5  */