import java.util.Scanner;

public class question25 {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String S = s.next();
        for(int i=S.length()-1;i>=0;i--)
        {
            System.out.print(S.charAt(i));
        }
    }
}
