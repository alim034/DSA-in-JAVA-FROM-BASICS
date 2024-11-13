// Java program to print full pyramid pattern.
import java.util.*;

public class Full_Pyramid_Pattern 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Height of Pyramid: ");
        int h = sc.nextInt();

        full_pyramid(h);
        sc.close();    
    }

    public static void full_pyramid(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for (int j=n-i; j>0; j--) 
            {
                System.out.print(" ");
            }
            
            for (int k=1; k<=2*i-1; k++) 
            {
                System.out.print("*");
            }
            System.out.println(); 
        }
    }
}
