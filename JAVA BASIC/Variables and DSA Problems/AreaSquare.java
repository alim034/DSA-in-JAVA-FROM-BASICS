import java.util.*;

public class AreaSquare 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Side of Square: ");
        int side = sc.nextInt();

        int area = side*side;
        System.out.println("Area of Square: " +area);
    }
}
