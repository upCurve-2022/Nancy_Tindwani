import java.lang.Math;
import java.util.Scanner;

public class question24 {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the base : ");
        int X = s.nextInt();
        System.out.print("Enter the power : ");
        int n = s.nextInt();
        System.out.print("Result is : "+(int)Math.pow(X,n));
    }
}
