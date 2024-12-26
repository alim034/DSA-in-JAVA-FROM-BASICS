import java.util.Arrays;

public class SearchIn2DArrays 
{
    public static void main(String[] args) 
    {
        int[][] arr = {
            {12,34,64,565},
            {65,86,65,76},
            {45,76,8657},
            {546,676}
        };
        int target = 8657;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] search(int[][] arr, int target)
    {
        for(int row=0; row<arr.length; row++)
        {
            for(int col=0; col<arr[row].length; col++)
            {
                if(arr[row][col]==target)
                {
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
