// https://leetcode.com/problems/power-of-two/description/
public class PowerOfThree 
{
    public static void main(String[] args) 
    {
        int n = 16;
        System.out.println(isPowerOfTwo(n));
    }

    public static boolean isPowerOfTwo(int n) 
    {
        if(n <= 0)
        {
            return false;
        }
        while(n%3==0)
        {
            n = n/3;
        }
        return n==1;
    }
}
