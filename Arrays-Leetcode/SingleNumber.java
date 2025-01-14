// https://leetcode.com/problems/single-number/
public class SingleNumber 
{
    public static void main(String[] args) 
    {
        int[] nums = {4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) 
    {
        int result = 0;
        for (int num : nums) 
        {
            result ^= num;
        }
        return result;
    }
}
