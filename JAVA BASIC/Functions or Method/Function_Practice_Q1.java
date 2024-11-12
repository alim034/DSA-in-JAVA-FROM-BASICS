// Java program to check even and odd number and print result in boolean value using methods
import java.util.*;

public class Function_Practice_Q1 
{
    public static boolean isEven(int a)
    {
        if(a%2==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Number: ");
        int a = sc.nextInt();

        if(isEven(a))
        {
            System.out.println("The Number is Even");
        }
        else
        {
            System.out.println("The Number is Odd");
        }

        sc.close();
    }
}
