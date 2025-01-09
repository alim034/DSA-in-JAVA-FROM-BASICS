// https://leetcode.com/problems/most-frequent-number-following-key-in-an-array/
import java.util.HashMap;
import java.util.Map;

public class MostFrequentNumber 
{
    public static void main(String[] args) 
    {
        int[] nums = {1,100,200,1,100};
        int m = 200;

        System.out.println(mostFrequent(nums, m));
    }

    public static int mostFrequent(int[] nums, int key) 
    {
        Map<Integer, Integer> targetCount = new HashMap<>();
        
        for (int i = 0; i < nums.length - 1; i++) 
        {
            if (nums[i] == key) 
            {
                int target = nums[i + 1];
                targetCount.put(target, targetCount.getOrDefault(target, 0) + 1);
            }
        }
        
        int maxCount = 0;
        int result = -1;
        
        for (Map.Entry<Integer, Integer> entry : targetCount.entrySet()) 
        {
            if (entry.getValue() > maxCount) 
            {
                maxCount = entry.getValue();
                result = entry.getKey();
            }
        }
        
        return result;
    }
}
