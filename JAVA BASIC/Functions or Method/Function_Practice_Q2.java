// Java Program to Check the Number is Palindrome or nor using function or methods
import java.util.*;

public class Function_Practice_Q2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Number: ");
        int a = sc.nextInt();

        if(isPalindrome(a))
        {
            System.out.println("Number is Palindrome");
        }
        else
        {
            System.out.println("Number is Not Palindrome");
        }

        sc.close();
    }

    public static boolean isPalindrome(int num)
    {
        int palindrome = num;
        int reverse = 0;

        while(palindrome != 0)
        {
            int remainder = palindrome%10;
            reverse = reverse*10 + remainder;
            palindrome = palindrome/10;
        }

        if(num==reverse)
        {
            return true;
        }
        return false;
    }
}
