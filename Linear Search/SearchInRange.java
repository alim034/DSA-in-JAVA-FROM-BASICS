public class SearchInRange 
{
    public static void main(String[] args)
    {
        int[] nums = {54,64,75,34,97,45,67};
        int target = 75;
        System.out.println(search(nums, target, 1, 5));
    }

    public static int search(int[] arr, int target, int start, int end)
    {
        int n = arr.length;
        if(n==0)
        {
            return -1;
        }

        for(int i=0; i<=n; i++)
        {
            if(arr[i]==target)
            {
                return i;
            }
        }

        return -1;
    }
}
