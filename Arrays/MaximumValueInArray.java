public class MaximumValueInArray 
{
    public static void main(String[] args)
    {
        int nums[] = {1,56,343,67};

        System.out.println("Maximum Value is:" + MaxValue(nums));
    }

    public static int MaxValue(int arr[])
    {
        int maxvalue = arr[0];
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>maxvalue)
            {
                maxvalue = arr[i];
            }
        }
        return maxvalue;
    }
}
