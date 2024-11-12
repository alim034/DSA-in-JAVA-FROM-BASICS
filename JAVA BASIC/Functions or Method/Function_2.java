// Java program to calculate sum using function or methods
import java.util.*;

public class Function_2 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int n2 = sc.nextInt();

        System.out.println("Sum of Numbers: " +CalculateSum(n1, n2));

        sc.close();
    }

    public static int CalculateSum(int a , int b)
    {
        int sum = a+b;
        return sum;
    }
}
