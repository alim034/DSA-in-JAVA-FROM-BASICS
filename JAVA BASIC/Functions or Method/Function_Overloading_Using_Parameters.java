// Java program to demonstrate the Function Overloading using parameters
import java.util.*;

public class Function_Overloading_Using_Parameters 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int n2 = sc.nextInt();
        System.out.print("Enter Third Number: ");
        int n3 = sc.nextInt();

        System.out.println("Sum of Two Numbers: " +Sum(n1, n2));
        System.out.println("Sum of Three Numbers: " +Sum(n1, n2, n3));

        sc.close();
    }
    
    public static int Sum(int a, int b)
    {
        return a+b;
    }

    public static int Sum(int a, int b, int c)
    {
        return a+b+c;
    }
}
