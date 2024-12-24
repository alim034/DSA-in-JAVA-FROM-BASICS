// https://leetcode.com/problems/running-sum-of-1d-array/description/
import java.util.Arrays;

public class RunningSumOfArrays 
{
    public static void main(String[] args)
    {
        int[] nums = {1,2,3,4};

        System.out.println(Arrays.toString(RunningSum(nums)));
    }

    public static int[] RunningSum(int[] nums)
    {
        int n = nums.length;
        int[] runningsum = new int[n];

        if(n > 0)
        {
            runningsum[0] = nums[0];
        }

        for(int i=1; i<n; i++)
        {
            runningsum[i] = runningsum[i-1] + nums[i];
        }

        return runningsum;
    }
}
