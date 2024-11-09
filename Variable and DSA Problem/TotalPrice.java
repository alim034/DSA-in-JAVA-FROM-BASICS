import java.util.*;

public class TotalPrice 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Price of Pen: ");
        float pen = sc.nextFloat();
        System.out.print("Enter Price of Pencil: ");
        float pencil = sc.nextFloat();
        System.out.print("Enter Price of Eraser: ");
        float eraser = sc.nextFloat();

        float total = pen+pencil+eraser;
        System.out.println("Total Price without gst: "+total);
        float gst = total*018f;

        System.out.println("GST: "+gst);
        System.out.println("Total Price with gst: "+(total+gst));
    }
}
