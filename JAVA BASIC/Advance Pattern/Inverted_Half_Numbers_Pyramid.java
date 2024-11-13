// java program to print th inverted half pyramid with numbers.
import java.util.*;

public class Inverted_Half_Numbers_Pyramid 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Height of Pyramid: ");
        int h = sc.nextInt();

        inverted_half_number_pyramid(h);

        sc.close();
    }

    public static void inverted_half_number_pyramid(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n-i+1; j++)
            {
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
}
