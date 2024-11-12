// Java Program to demonstrate Method Overloading using Data Types

public class Function_Overloading_Using_DataTypes 
{
    public static void main(String[] args)
    {
        System.out.println(Sum(5,50));
        System.out.println(Sum(4.5f , 5.5f));
    }

    public static int Sum(int n, int m)
    {
        return n+m;
    }

    public static float Sum(float n, float m)
    {
        return n+m;
    }
}
