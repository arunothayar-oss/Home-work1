
package BankInterestStatic;
import java.util.Scanner;

public class BankInterestCalculator 
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter Principal Amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Number of Years: ");
        int years = sc.nextInt();

        
        double interest = Bank.calculateInterest(principal, years);

        
        System.out.println("\n--- Bank Interest Details ---");
        System.out.println("Bank Name: " + Bank.BANK_NAME);
        System.out.println("Principal Amount: " + principal);
        System.out.println("Years: " + years);
        System.out.println("Interest Amount: " + interest);

       
    }
} 

