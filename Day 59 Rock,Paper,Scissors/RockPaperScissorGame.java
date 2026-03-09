
package arrayszohoques;

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissorGame 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        Random ran=new Random();
        int userchoice;
        int computerchoice;
        char playAgain;
        do
        {
        
            System.out.println("1.Enter the option :Rock ");
            System.out.println("2.Enter the option :Paper");
            System.out.println("3.Enter the option :Scissor");
            System.out.println("Enter the choice");
            userchoice=sc.nextInt();
            computerchoice=ran.nextInt(3)+1;
            System.out.println("computerchoice:"+computerchoice);
            if(userchoice==computerchoice)
            {
                System.out.println("Match draw");
            }
            else if(userchoice==1&&computerchoice==3||userchoice==3&&computerchoice==2||userchoice==2&&computerchoice==1)
            {
                System.out.println("User become winner");
            }
            else
            {
                System.out.println("computer wins");
            }
            System.out.println("Do you want to playAgain?(y/n)");
            playAgain=sc.next().charAt(0);
        
        }while(playAgain=='y');
        
    }
 
}
