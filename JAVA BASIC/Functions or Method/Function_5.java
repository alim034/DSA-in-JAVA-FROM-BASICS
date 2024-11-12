// Java program to calculate factorial of number using method or function
import java.util.*;

public class Function_5 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Number: ");
        int n = sc.nextInt();

        System.out.println("Factorial of Number is: " +Factorial(n));
        sc.close();
    }

    public static int Factorial(int n)
    {
        int f=1;
        for(int i=1; i<=n; i++)
        {
            f = f*i;
        }
        return f;
    }
}
