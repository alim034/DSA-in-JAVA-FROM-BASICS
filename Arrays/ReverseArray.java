import java.util.Arrays;

public class ReverseArray 
{
    public static void main(String[] args)
    {
        int[] nums = {1,45,65,87,56};

        reverse(nums);
        System.out.println(Arrays.toString(nums));
    }

    // Function for Swapping of the Elements
    public static void swap(int[] arr, int index1, int index2)
    {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    // Function for Reverse the Array
    public static void reverse(int[] arr)
    {
        int start = 0;
        int end = arr.length-1;

        while(start < end)
        {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}
