// Java program to print the zero one triangle pattern.
import java.util.*;

public class Zero_One_Triangle_Pattern 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Hright of Triangle: ");
        int h = sc.nextInt();

        zero_one_triangle(h);

        sc.close();
    }

    public static void zero_one_triangle(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                if((i+j)%2==0)
                {
                    System.out.print("1 ");
                }
                else
                {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
