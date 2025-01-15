// https://leetcode.com/problems/ugly-number/description/
public class UglyNumber 
{
    public static void main(String[] args) 
    {
        int n = 6;
        System.out.println(isUgly(n));
    }

    public static boolean isUgly(int n) 
    {
        if (n <= 0) 
        {
            return false;
        }
        int[] divisors = {2, 3, 5};
        for (int divisor : divisors) 
        {
            while (n % divisor == 0) 
            {
                n /= divisor;
            }
        }
        return n == 1;
    }
}
