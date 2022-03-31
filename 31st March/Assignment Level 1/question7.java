import java.util.*;
public class question7 {
    public static void main(String args[])
    {
        int x, y, z,l;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number:");
        x = s.nextInt();
        System.out.print("Enter the second number:");
        y = s.nextInt();
        System.out.print("Enter the third number:");
        z = s.nextInt();
        if(x > y && x > z)
        {
            System.out.println("Largest number is:"+x);
        }
        else if(y > z)
        {

            System.out.println("Largest number is:"+y);
        }
        else
        {
            System.out.println("Largest number is:"+z);
        }
        if(x>y && x>z)
        {
            if(y>z)
                System.out.print("2nd largest: "+y);
            else
                System.out.print("2nd largest: "+z);
        }
        else if(y>z && y>x)
        {
            if(z>x)
                System.out.print("2nd largest: "+z);
            else
                System.out.print("2nd largest: "+x);
        }
        else if(x>y)
            System.out.print("2nd largest: "+x);
        else
            System.out.print("2nd largest: "+y);

    }
}
