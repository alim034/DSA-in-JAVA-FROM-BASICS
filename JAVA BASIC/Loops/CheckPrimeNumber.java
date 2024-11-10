// Check Prime Number using Loops
import java.util.*;

public class CheckPrimeNumber 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        boolean isPrime = true;

        if (number <= 1) 
        {
            isPrime = false;
        } 
        else 
        {
            for (int i = 2; i <= Math.sqrt(number); i++) 
            {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) 
        {
            System.out.println(number + " is a prime number.");
        } 
        else 
        {
            System.out.println(number + " is not a prime number.");
        }

        sc.close();
    }
}