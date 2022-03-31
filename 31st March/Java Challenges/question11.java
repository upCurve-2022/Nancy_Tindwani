import java.lang.*;
import java.util.Scanner;

public class question11 {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = s.next();
        String s1="";
        for(int i=0;i<str.length();i++)
        {
            if(!Character.isUpperCase(str.charAt(i)) && str.charAt(i)!=' ')
                s1=s1+(char)((int)str.charAt(i)-32);
            else
                s1=s1+str.charAt(i);
        }
        System.out.print(s1);
    }
}
