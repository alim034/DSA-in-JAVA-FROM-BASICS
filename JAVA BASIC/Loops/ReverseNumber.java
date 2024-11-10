//Reverse the Number using While loop
import java.util.*;

public class ReverseNumber 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Number: ");
        int N = sc.nextInt();
        System.out.println("Number Before Reverse: " +N);
        int rev = 0;

        while(N>0)
        {
            int lastdigit = N%10;
            rev = (rev*10) + lastdigit;
            N = N/10;
        }
        System.out.print("Reverse Number: " +rev);

        sc.close();
    }    
}
