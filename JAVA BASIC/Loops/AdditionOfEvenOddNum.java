// prints the sum of the even and odd integers
import java.util.*;

public class AdditionOfEvenOddNum 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int evenSum = 0, oddSum = 0;

        System.out.println("Enter numbers (0 to stop):");

        int number = scanner.nextInt();
        while (number != 0) 
        {
            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
            number = scanner.nextInt(); // Read the next number
        }

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);

        scanner.close();
    }
}
