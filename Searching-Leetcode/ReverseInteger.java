// https://leetcode.com/problems/reverse-integer/
public class ReverseInteger 
{
    public static void main(String[] args) 
    {
        int x = 123;
        System.out.println(reverse(x));
    }

    public static int reverse(int x) 
    {
        int reversed = 0;
        
        while (x != 0) 
        {
            int digit = x % 10;
            x /= 10;
            
          
            if (reversed > Integer.MAX_VALUE/10 || 
                (reversed == Integer.MAX_VALUE / 10 && digit > 7)) 
                        return 0;
            if (reversed < Integer.MIN_VALUE/10 || 
                (reversed == Integer.MIN_VALUE / 10 && digit < -8)) 
                        return 0;
            
            reversed = reversed * 10 + digit;
        }
        
        return reversed;
    }
}
