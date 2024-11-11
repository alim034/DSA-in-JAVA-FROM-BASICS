// Triangle same number pattern using java
import java.util.*;

public class Triangle_Number_Pattern1 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Height of Triangle: ");
        int h = sc.nextInt();

        for(int i=1; i<=h; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }


        sc.close();
    }
}
