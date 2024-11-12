// Java Program to check prime number using method
import java.util.*;

public class Function_6 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Number: ");
        int N = sc.nextInt();

        System.out.println(isPrime(N));

        sc.close();
    }

    public static boolean isPrime(int n)
    {
        boolean isPrime = true;

        if(n==2)
        {
            isPrime = true;
        }

        for(int i=2; i<n-1; i++)
        {
            if(n%i==0)
            {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }
}
