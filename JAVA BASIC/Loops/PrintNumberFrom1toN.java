//Print Numbers from 1 to N range using while loop.
import java.util.*;

public class PrintNumberFrom1toN 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Range: ");
        int N = sc.nextInt();
        int count = 1;

        while(count<=N)
        {
            System.out.print(count + " ");
            count++;
        }

        sc.close();
    }    
}
