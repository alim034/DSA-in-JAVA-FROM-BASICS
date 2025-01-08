//https://leetcode.com/problems/sqrtx/

public class Sqrt 
{
    public static void main(String[] args) 
    {
        int x = 4;
        System.out.println(mySqrt(x));

        int y = 8;
        System.out.println(mySqrt(y));
    }

    public static int mySqrt(int x) 
    {
        if (x == 0 || x == 1) 
        {
            return x;
        }

        for (long i = 1; i <= x; i++) 
        {
            if (i * i > x) 
            {
                return (int) i - 1;
            }

        }
        return 0;
    }
}
