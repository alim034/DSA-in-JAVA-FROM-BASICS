public class LargestElementInArray 
{
    public static void main(String[] args)
    {
        int numbers[] = {1,5,7,36,8};
        System.out.println("The Largest Element of Array: " + LargestElement(numbers));
    }

    public static int LargestElement(int arr[])
    {
        int max = arr[0];
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        return max;
    }
}

