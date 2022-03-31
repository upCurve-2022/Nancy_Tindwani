import java.util.Scanner;

public class question12 {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first string : ");
        String s1 = s.next();
        System.out.print("Enter the second string : ");
        String s2 = s.next();
        System.out.println("First String : "+s1);
        System.out.println("Second String : "+s2);
        System.out.print("Concatenated String : "+s1+s2);
    }
}
