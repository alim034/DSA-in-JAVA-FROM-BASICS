// Hollow Rectangle pattern using java
import java.util.*;

public class Hollow_Rectangle_Pattern 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Column of Rectangle: ");
        int c = sc.nextInt();
        System.out.print("Enter Row's of Rectangle: ");
        int r = sc.nextInt();

        Hollow_Rectangle(r, c);

        sc.close();
    }    

    public static void Hollow_Rectangle(int r , int c)
    {
        for(int i=1; i<=r; i++)
        {
            for(int j=1; j<=c; j++)
            {
                if(i == 1 || i == r || j == 1 || j == c)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
