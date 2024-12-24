// https://leetcode.com/problems/build-array-from-permutation/
import java.util.*;

public class BuildArrayFromPermutation 
{
    public static void main(String[] args)
    {
        int[] nums = {0,2,1,5,3,4};
        buildArray(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static int[] buildArray(int[] nums) 
    {
        int n = nums.length;
        for(int i=0; i<n; i++)
        {
            nums[i] += (nums[nums[i]]%n)*n; 
        }
        for(int i=0; i<n; i++)
        {
            nums[i]/=n;
        }
        return nums;
    }
}
