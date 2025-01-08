public class OrderCheck 
{
    // Function to check if the array is in ascending order
    public boolean isAscending(int[] arr) 
    {
        for (int i = 0; i < arr.length - 1; i++) 
        {
            if (arr[i] > arr[i + 1]) 
            {
                return false; 
            }
        }
        return true; 
    }

    // Function to check if the array is in descending order
    public boolean isDescending(int[] arr) 
    {
        for (int i = 0; i < arr.length - 1; i++) 
        {
            if (arr[i] < arr[i + 1]) 
            {
                return false; 
            }
        }
        return true; 
    }


    public static void main(String[] args) 
    {
        OrderCheck oc = new OrderCheck();
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {5, 4, 3, 2, 1};
        int[] arr3 = {1, 3, 2, 4, 5};

        System.out.println("Array 1 is in ascending order: " + oc.isAscending(arr1)); 
        System.out.println("Array 1 is in descending order: " + oc.isDescending(arr1)); 
        System.out.println("Array 2 is in ascending order: " + oc.isAscending(arr2)); 
        System.out.println("Array 2 is in descending order: " + oc.isDescending(arr2)); 
        System.out.println("Array 3 is in ascending order: " + oc.isAscending(arr3)); 
        System.out.println("Array 3 is in descending order: " + oc.isDescending(arr3)); 
    }
}

