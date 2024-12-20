//https://leetcode.com/problems/peak-index-in-a-mountain-array/
//https://leetcode.com/problems/find-peak-element/

public class PeakElementInArray 
{
    public int peakIndexInMountainArray(int[] arr) 
    {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) 
        {
            int mid = low + (high - low) / 2;

            // right side
            if (arr[mid] > arr[mid + 1]) 
            {
                high = mid;
            }
            else 
            {
                low = mid + 1;
            }
        }
        return low; 
    }


    public static void main(String[] args) 
    {
        PeakElementInArray finder = new PeakElementInArray();
        
        int[] arr1 = {0, 1, 0};
        System.out.println(finder.peakIndexInMountainArray(arr1)); 
        int[] arr2 = {0, 2, 1, 0};
        System.out.println(finder.peakIndexInMountainArray(arr2)); 
        int[] arr3 = {0, 10, 5, 2};
        System.out.println(finder.peakIndexInMountainArray(arr3)); 
    }
}
