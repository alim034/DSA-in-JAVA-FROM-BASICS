//https://leetcode.com/problems/array-nesting/submissions/1492708495/
class ArrayNesting {
    public int arrayNesting(int[] nums) {
        int n = nums.length;
        int maxLength = 0;
      
        for (int i = 0; i < n; i++) {
            int start = nums[i];
            nums[i] = -1;
            int length = 0;
            
            // Go to depth as much as you can until you hit -1 (i.e., a number which was already visited)
            while (start != -1) {
                length++;
                int temp = start;
                start = nums[start];
                nums[temp] = -1;
            }
          
            maxLength = Math.max(maxLength, length);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        ArrayNesting solution = new ArrayNesting();
        
        int[] nums1 = {5, 4, 0, 3, 1, 6, 2};
        System.out.println(solution.arrayNesting(nums1)); // Output: 4

        int[] nums2 = {1, 2, 0};
        System.out.println(solution.arrayNesting(nums2)); // Output: 2
    }
}
