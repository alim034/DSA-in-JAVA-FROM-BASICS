public class FibonacciRecursion 
{
    public static void main(String[] args) 
    {
        int num = 10; 

        System.out.println("Fibonacci Series up to " + num + " terms:");
        for (int i = 0; i < num; i++) 
        {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n)
    {
        if (n <= 1) 
        {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
