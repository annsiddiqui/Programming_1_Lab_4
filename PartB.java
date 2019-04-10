import java.util.Scanner;
/**
 * @author Qurrat-al-Ain Siddiqui
 */
public class PartB
{
    public static void main (String[] args)
    {
        double balance;
        double interest = 0;
        
        Scanner keyboard = new Scanner (System.in);
        
        System.out.println("Enter the balance in your account: ");
        balance = keyboard.nextDouble();
        
        if (balance < 100){
            System.out.println("There is a $10.00 service charge.");
        }else if (balance < 10000){
            interest = balance * 0.04; 
        }else{
            interest = 400 + (balance - 10000) * 0.05;
        }
        System.out.println("The interest is: " + interest);
    }
}    