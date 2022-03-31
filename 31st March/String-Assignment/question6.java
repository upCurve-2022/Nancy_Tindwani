import java.util.*;
public class question6 {
    public static void main(String args[])
    {
        int f=1,c1=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s1=sc.nextLine();
        System.out.println("Enter the string: ");
        String s2=sc.nextLine();
        Object objStr = s1;
        System.out.println("*************1st Method (using equals() method)************");
        System.out.println("Are the two strings equal?" +" "+ s1.equals(s2));
        System.out.println("*************2nd Method (Using compareTo() method)************");
        f=s1.compareTo(s2);
        if(f==0)
            System.out.println("Yes the entered strings are equal ");
        else
            System.out.println("No the entered strings are not equal ");

    }
}
