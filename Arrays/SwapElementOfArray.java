import java.util.Arrays;

public class SwapElementOfArray 
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5};

        Swap(arr, 0, 4);

        // Print the Result of Swaping
        System.out.println(Arrays.toString(arr));
    }

    public static void Swap(int arr[], int index1, int index2)
    {
        // Swap of element using indexes
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
