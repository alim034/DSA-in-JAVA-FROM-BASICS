import java.util.*;

public class LinearSearch 
{
    public static void main(String[] args)
    {
        int number[] = {2,3,4,5,6,7,8};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Key To Find Out: ");
        int key = sc.nextInt();

        int index = Linearsearch(number, key);
        if(index==-1)
        {
            System.out.println("Key Not Found");
        }
        else
        {
            System.out.println("The Key Found at Index " + index);
        }

        sc.close();
    }

    public static int Linearsearch(int number[], int key)
    {
        for(int i=0; i<number.length; i++)
        {
            if(number[i]==key)
            {
                return i;
            }
        }
        return -1;
    }
}
