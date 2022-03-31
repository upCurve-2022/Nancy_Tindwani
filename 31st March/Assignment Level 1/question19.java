import java.util.Scanner;

public class question19 {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = s.nextInt();
        String S="";
        while(n!=0)
        {
           int r=n%2;
           S=r+S;
           n=n/2;
        }
        System.out.print("Binary number is : "+S);
    }
}
