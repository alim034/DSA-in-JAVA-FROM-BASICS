// Square Star Pattern using java
import java.util.*;

public class SquarePattern 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Height of Square: ");
        int h = sc.nextInt();

        for(int i=0; i<h; i++)
        {
            for(int j=0; j<h; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}
