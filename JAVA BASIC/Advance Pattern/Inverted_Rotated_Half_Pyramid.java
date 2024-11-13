// Inverted roatated half pyramid pattern using java
import java.util.*;

public class Inverted_Rotated_Half_Pyramid 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Height of Pyramid: ");
        int h = sc.nextInt();

        inverted_rotated_half_pyramid(h);

        sc.close();
    }

    public static void inverted_rotated_half_pyramid(int n)
    {
        for(int i=1; i<=n; i++)
        {
            // spaces
            for(int j=1; j<=n-i; j++)
            {
                System.out.print(" ");
            }
            // star
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
