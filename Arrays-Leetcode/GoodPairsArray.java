// https://leetcode.com/problems/number-of-good-pairs/description/

import java.util.HashMap;
import java.util.Map;

public class GoodPairsArray 
{
    public static void main(String[] args)
    {
        int[] nums = {1,2,3,1,1,3};
        
        System.out.println(numIdenticalPairs(nums));
    }


    public static int numIdenticalPairs(int[] nums) {
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int num : nums) {
            result += map.getOrDefault(num, 0);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        return result;
    }
}
