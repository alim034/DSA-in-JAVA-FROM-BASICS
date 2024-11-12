// java program to swap two numbers using function
import java.util.*;

public class Function_4 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int n2 = sc.nextInt();

        Swap(n1, n2);
        sc.close();
    }   
    
    public static void Swap(int a , int b)
    {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
    }
}
