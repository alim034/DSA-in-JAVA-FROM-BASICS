// Java program to Calculate Product of Numbers using Functions or method.
import java.util.*;

public class Function_3 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int n2 = sc.nextInt();

        System.out.println("Product of Numbers: " +CalculateProduct(n1,n2));
        sc.close();
    }    

    public static int CalculateProduct(int a, int b)
    {
        int product = a*b;
        return product;
    }
}
