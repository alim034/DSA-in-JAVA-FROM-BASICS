// Java Program to print all prime numbers in range
import java.util.*;

public class Function_7 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Range: ");
        int N = sc.nextInt();

        PrimeInRange(N);

        sc.close();
    }    

    public static boolean isPrime(int n)
    {
        boolean isPrime = true;

        if(n==2)
        {
            isPrime = true;
        }

        for(int i=2; i<=n-1; i++)
        {
            if(n%i==0)
            {
                isPrime = false;
            }
        }

        return isPrime;
    }

    public static void PrimeInRange(int n1)
    {
        for(int i=2; i<=n1; i++)
        {
            if(isPrime(i))
            {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

}
