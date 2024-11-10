//Print Sum of First N Natural Numbers using while loop
import java.util.*;

public class SumOfNaturalNumbers 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;

        while(i<=n)
        {
            sum += i;
            i++;
        }
        System.out.print("Sum is: " +sum);

        sc.close();
    }
}
