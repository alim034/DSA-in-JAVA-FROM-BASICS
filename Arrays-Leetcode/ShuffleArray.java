// https://leetcode.com/problems/shuffle-the-array/
import java.util.Arrays;

public class ShuffleArray 
{
    public static void main(String[] args)
    {
        //int[] nums = {2,5,1,3,4,7};
        int[] nums = {1,2,3,4,5,6};
        int n = 3;

        System.out.println(Arrays.toString(shuffleofarray(nums, n)));
    }

    public static int[] shuffleofarray(int[] arr, int n)
    {
        int[] ans = new int[2*n];
        int count = 0;
        for(int i=0; i<n; i++)
        {
            ans[count] = arr[i];
            ans[count+1] = arr[i+n];
            count += 2;
        }
        return ans;
    }
}
