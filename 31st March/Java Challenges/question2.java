import java.lang.Math;
import java.util.Scanner;

public class question2 {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        int r = s.nextInt();
        System.out.print("Enter the height : ");
        int h = s.nextInt();
        float v;
        v= (float) (Math.PI*(Math.pow(r,2))*h);
        System.out.print("Volume is : "+v);
    }
}
