// Java Program to print Floyds triangle pattern.
import java.util.*;

public class Floyds_Triangle_Pattern 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Height of Triangle: ");
        int h = sc.nextInt();

        floyds_triangle(h);

        sc.close();
    }

    public static void floyds_triangle(int n)
    {
        int counter=1;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(counter +" ");
                counter++;
            }
            System.out.println();
        }
    }
}
