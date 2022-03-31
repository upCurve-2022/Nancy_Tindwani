import java.util.*;
public class question5 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number=sc.nextInt();
        float sqroot= (float) Math.sqrt(number)-(int)Math.sqrt(number);
        if(sqroot==0)
            System.out.print("Perfect square");
        else
            System.out.print("Not Perfect square");
    }
}
