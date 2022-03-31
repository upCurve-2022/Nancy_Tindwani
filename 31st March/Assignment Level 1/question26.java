import java.util.Scanner;
public class question26 {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String S = s.next();
        String S1="";
        for(int i=S.length()-1;i>=0;i--)
        {
            S1=S1+S.charAt(i);
        }
        int c=S.compareTo(S1);
        if(c==0)
        {
            System.out.print("String is Palindrome");
        }
        else
            System.out.print("String is not Palindrome");
    }
}
