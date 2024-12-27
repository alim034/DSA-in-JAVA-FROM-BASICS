//https://leetcode.com/problems/create-target-array-in-the-given-order/description/
import java.util.Arrays;

public class TargetArrayInOrder 
{
    public static void main(String[] args)
    {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};

        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }

    public static int[] createTargetArray(int[] nums, int[] index)
    {
        int[] target = new int[index.length];

        for(int i=0; i<index.length; i++)
        {
            sol(target , nums[i] , index[i]);
        }
        return target;
    }

    public static void sol(int[] target, int value, int index)
    {
        for(int i=target.length-1; i>index; i--)
        {
            target[i] = target[i-1];
        }
        target[index]=value;
    }
}
