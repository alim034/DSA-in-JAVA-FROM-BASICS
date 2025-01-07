// Java code to print the Butter Fly Pattern.
import java.util.*;

public class ButterFly_Pattern 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Height of ButterFly: ");
        int h = sc.nextInt();

        butterfly_pattern(h);

        sc.close();
    }   
    
    public static void butterfly_pattern(int n)
    {
        // 1st half
        for(int i=1; i<=n; i++)
        {
            // stars
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            //spaces
            for(int j=1; j<=2*(n-i); j++)
            {
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd half
        for(int i=n; i>=1; i--)
        {
            //stars
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            //spaces
            for(int j=1; j<=2*(n-i); j++)
            {
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
