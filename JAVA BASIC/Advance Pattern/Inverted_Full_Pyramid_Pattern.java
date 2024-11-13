// Java program to print Inverted full pyramid
import java.util.*;

public class Inverted_Full_Pyramid_Pattern 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Height of Pyramid: ");
        int h = sc.nextInt();

        inverted_full_pyramid(h);
        sc.close();
    }

    public static void inverted_full_pyramid(int n)
    {
        for (int i=n; i>=1; i--) 
        {
            for (int j=1; j<=n-i; j++) 
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
