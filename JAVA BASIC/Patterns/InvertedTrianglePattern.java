// Inverted Triangle Star Pattern using java
import java.util.*;

public class InvertedTrianglePattern 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Height of Triangle: ");
        int h = sc.nextInt();

        for(int i=1; i<=h; i++)
        {
            for(int j=1; j<=h-i+1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
