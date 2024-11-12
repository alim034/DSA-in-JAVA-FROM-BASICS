// Java program to calculate average of three numbers using method
import java.util.*;

public class Function_Practice_Q 
{
    public static double AveragePrint(double a, double a1, double a2)
    {
        double Average = ((a+a1+a2)/3);

        return Average;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();
        System.out.print("Enter Third Number: ");
        int c = sc.nextInt();

        System.out.println(AveragePrint(a, b, c));

        sc.close();
    }
}
