import java.util.*;
public class question5 {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
        System.out.print("Enter number- ");
        int Number = sc.nextInt();
        if(Number%2==0)
            System.out.print("Number is even");
        else
            System.out.print("Number is odd");
    }
}
