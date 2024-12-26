public class MinimumValue 
{
    public static void main(String[] args)
    {
        int[] nums = {12,345,64,6,4,-6};
        System.out.println(MinValue(nums));
    }

    public static int MinValue(int[] arr)
    {
        int ans = arr[0];
        for(int i=1; i< arr.length; i++)
        {
            if(arr[i]<ans)
            {
                ans = arr[i];
            }
        }
        return ans;
    }
}
