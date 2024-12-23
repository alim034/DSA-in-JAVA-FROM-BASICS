public class MaximumValueInRange 
{
    public static void main(String[] args)
    {
        int nums[] = {1,2,3,9,5};

        
        System.out.println(MaxInRange(nums, 1, 3));
    }

    public static int MaxInRange(int[] arr, int start, int end)
    {
        int maxval = arr[start];
        for(int i=start; i<=end; i++)
        {
            if(arr[i]>maxval)
            {
                maxval = arr[i];
            }
        }
       return maxval;
    }
}
