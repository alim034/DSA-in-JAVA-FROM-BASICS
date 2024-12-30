// https://leetcode.com/problems/contains-duplicate-ii/description/
import java.util.HashMap;
import java.util.Map;

class ContainsDuplicate
{
    public boolean containsNearbyDuplicate(int[] nums, int k) 
    {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) 
        {
            if (map.containsKey(nums[i]) && Math.abs(map.get(nums[i]) - i) <= k) 
            {
                return true;
            } 
            else 
            {
                map.put(nums[i], i); // {number, index}
            }
        }
        
        return false;
    }

    public static void main(String[] args) 
    {
        ContainsDuplicate solution = new ContainsDuplicate();

        int[] nums1 = {1, 2, 3, 1};
        int k1 = 3;
        System.out.println(solution.containsNearbyDuplicate(nums1, k1)); // Output: true

        int[] nums2 = {1, 0, 1, 1};
        int k2 = 1;
        System.out.println(solution.containsNearbyDuplicate(nums2, k2)); // Output: true

        int[] nums3 = {1, 2, 3, 4, 5};
        int k3 = 2;
        System.out.println(solution.containsNearbyDuplicate(nums3, k3)); // Output: false
    }
}
