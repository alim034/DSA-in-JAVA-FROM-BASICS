import java.util.*;
import java.util.Arrays.*;

public class Intro_Array 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Syntax of an Array:
        // data-type[] array_name = new data-type[size of an array]
        // data-type array_name[] = new data-type[size of an array]

        /* 
        // FIRST EXAMPLE
       int[] nums= new int[5];
        
        // Input to the Array (1st method)
        nums[0] = 2;
        nums[1] = 28;
        nums[2] = 7;
        nums[3] = 4;

        // Priting to the Array (1st method)
        System.out.println(nums[0]);
        System.out.println(nums[2]); 
        */

        /* 
        // SECOND EXAMPLE
        int nums1[] = new int[5];

        // Input to the Array (2nd method)
        System.out.println("Enter Element of an Array: ");
        for(int i=0; i<nums1.length; i++)
        {
            nums1[i] = sc.nextInt();
        }

        // Printing the Array (2nd Method) Using for loop
        System.out.println("Element of An Array: ");
        for(int i=0; i<nums1.length; i++)
        {
            System.out.print(nums1[i] + " ");
        }

        // Printing the Array (3rd Method) Using for each loop
        System.out.println("Element of an Array:");
        for(int nums: nums1)
        {
            System.out.print(nums + " ");
        }

        // Pringting the Array (4th method) Using Builr in function
        System.out.print(Arrays.toString(nums1));
        */

        // Function Calling in Arrays
        int[] arr = new int[4];
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print(Arrays.toString(arr)); // Before Changing Value: [45,54,45,54]
        ChangeValue(arr);
        System.out.print(Arrays.toString(arr)); // After Changing Value: [87,54,45,54]

        sc.close();
    }

    public static void ChangeValue(int[] arr)
    {
        arr[0] = 87;
    }
}
