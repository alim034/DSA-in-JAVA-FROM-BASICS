// https://leetcode.com/problems/search-in-rotated-sorted-array/description/

public class SearchInRotatedArray 
{
    public int search(int[] nums, int target) 
    {
        int N = nums.length;
        int left = 0;
        int right = N - 1;

        while (left <= right) 
        {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) 
            {
                return mid;
            }

            if (nums[left] <= nums[mid]) 
            {
                if (nums[left] <= target && target < nums[mid]) 
                {
                    right = mid - 1;
                } 
                else 
                {
                    left = mid + 1;
                }
            } 
            else 
            {
                if (nums[mid] < target && target <= nums[right]) 
                {
                    left = mid + 1;
                } 
                else 
                {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) 
    {
        SearchInRotatedArray solution = new SearchInRotatedArray();

        int[] nums1 = {4, 5, 6, 7, 0, 1, 2};
        int target1 = 0;
        System.out.println(solution.search(nums1, target1)); // Output: 4

        int[] nums2 = {4, 5, 6, 7, 0, 1, 2};
        int target2 = 3;
        System.out.println(solution.search(nums2, target2)); // Output: -1

        int[] nums3 = {1};
        int target3 = 0;
        System.out.println(solution.search(nums3, target3)); // Output: -1
    }
}

