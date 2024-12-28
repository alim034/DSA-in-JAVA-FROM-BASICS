// https://leetcode.com/problems/maximum-subarray/description/

public class MaximumSubArray 
{
    public static void main(String[] args) 
    {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums)
    {
        int maxsum = nums[0];
        int sum = 0;

        for(int i=0; i<nums.length; i++)
        {
            sum += nums[i];

            if(sum>maxsum)
            {
                maxsum = sum;
            }

            if(sum<0)
            {
                sum = 0;
            }
        }

        return maxsum;
    }
}
