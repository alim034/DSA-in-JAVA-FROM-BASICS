// Java Program to compute the sum of digit in Integer using method
import java.util.*;

public class Function_Practice_Q3 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Integer: ");
        int num = sc.nextInt();

        System.out.println("The Sum is: " +SumDigits(num));

        sc.close();
    }

    public static int SumDigits(int n)
    {
        int sum_digit = 0;
        while (n>0) 
        {
            int lastDigit = n%10;
            sum_digit += lastDigit;
            n = n/10;
        }

        return sum_digit;
    }
}
