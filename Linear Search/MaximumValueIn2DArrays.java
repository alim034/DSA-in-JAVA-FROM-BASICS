public class MaximumValueIn2DArrays 
{
    public static void main(String[] args) 
    {
        int[][] nums = {
            {123,456,789,76,4564,34},
            {3435,5656,75676},
            {45,34,65,75,34,75,77},
            {34,645,646,767,867},
            {656,7562,45,65565}
        };

        System.out.println(Max(nums));
    }

    public static int Max(int[][] arr)
    {
        int max = Integer.MIN_VALUE;
        for(int[] ints: arr)
        {
            for(int element: ints)
            {
                if(element>max)
                {
                    max = element;
                }
            }
        }
        return max;
    }
}
