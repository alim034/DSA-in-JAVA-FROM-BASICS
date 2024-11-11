// Triangle Star pattern using java
import java.util.*;

public class TrianglePattern 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Height of Triangle: ");
        int h = sc.nextInt();

        for(int i=0; i<h; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
