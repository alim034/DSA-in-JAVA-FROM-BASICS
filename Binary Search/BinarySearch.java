public class BinarySearch 
{
    public int binarySearch(int[] arr, int x) 
    {
        int left = 0, right = arr.length - 1;

        while (left <= right) 
        {
            int mid = left + (right - left) / 2;

            // Check if x is present at mid
            if (arr[mid] == x)
                return mid;

            // If x greater, ignore left half
            if (arr[mid] < x)
                left = mid + 1;

            // If x is smaller, ignore right half
            else
                right = mid - 1;
        }

        return -1;
    }

    // Main method to test the binary search function
    public static void main(String[] args) 
    {
        BinarySearch bs = new BinarySearch();
        int[] arr = {2, 3, 4, 10, 40};
        int result = bs.binarySearch(arr, 10);

        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }
}

