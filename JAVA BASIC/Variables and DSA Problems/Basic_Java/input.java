package Basic_Java;
import java.util.*;

public class input 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Integer Number: ");
        int n = sc.nextInt();
        System.out.println(n);

        System.out.print("Enter Name: ");
        String s = sc.nextLine();
        System.out.println(s);
    }
}
