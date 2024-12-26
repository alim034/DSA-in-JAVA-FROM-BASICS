public class LinearSearch 
{
    public static void main(String[] args)
    {
        int[] nums = {14,53,67,45,867};
        int target = 867;
        int search = linearSearch(nums, target);
        System.out.println(search);
    }

    public static int linearSearch(int[] arr, int target)
    {
        if(arr.length==0)
        {
            return -1;
        }

        for(int i=0; i<=arr.length; i++)
        {
            if(arr[i]==target)
            {
                return i;
            }
        }

        return -1;
    }
}
