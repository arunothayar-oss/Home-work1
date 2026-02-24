
package pkgenum;

import java.util.Scanner;


public class WeekdayMain 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int choice;
        do
        {
            System.out.println("\n======Weekday working system====");
            System.out.println("1.check if workingday");
            System.out.println("2.check if weekend");
            System.out.println("3.Display all days");
            System.out.println("4.Exit");
            System.out.println("Enter your choice");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                {
                    
                    System.out.print("Enter day: ");
                    String input1 = sc.next().toUpperCase();

                    try 
                    {
                        EnumDay day1 = EnumDay.valueOf(input1);

                        if (day1 == EnumDay.SATURDAY || day1 == EnumDay.SUNDAY)
                        {
                            System.out.println(day1 + " is NOT a Working Day.");
                        } 
                        else
                        {
                            System.out.println(day1 + " is a Working Day.");
                        }
                    } 
                    catch (IllegalArgumentException e) 
                    {
                        System.out.println("Invalid Day!");
                    }
                    break;
                }

                case 2:
                {
                    System.out.print("Enter day: ");
                    String input2 = sc.next().toUpperCase();

                    try 
                    {
                       EnumDay day2 = EnumDay.valueOf(input2);

                        if (day2 == EnumDay.SATURDAY || day2 == EnumDay.SUNDAY)
                        {
                            System.out.println(day2 + " is a Weekend.");
                        } 
                        else 
                        {
                            System.out.println(day2 + " is NOT a Weekend.");
                        }
                    } 
                    catch (IllegalArgumentException e) 
                    {
                        System.out.println("Invalid Day!");
                    }
                    break;
                }

                case 3:
                    System.out.println("All Days of the Week:");
                    for (EnumDay d : EnumDay.values())
                    {
                        System.out.println(d);
                    }
                    break;

                case 4:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }  
                
            
        }while(choice!=4);
    }
}
