//https://leetcode.com/problems/concatenation-of-array/description/
import java.util.Arrays;

public class ConcatenationOfArray 
{
    public static void main(String[] args)
    {
        int[] nums = {1,2,1};
    
        System.out.println(Arrays.toString(concatenation(nums)));
    }

    public static int[] concatenation(int[] nums)
    {
        int n = nums.length;
        int[] ans = new int[2*n];

        for(int i=0; i<n; i++)
        {
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }

        return ans;
    }
}
