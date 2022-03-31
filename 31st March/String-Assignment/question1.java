import java.util.Scanner;
public class question1 {
    public static boolean referenceCheck(Object x, Object y) {
        if (x == y) {
            System.out.println("Both pointing to the same reference");

        } else {
            System.out.println("Both are pointing to different reference");
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String st1 = s.next();
        System.out.print("Enter the second string : ");
        String st2 = s.next();
        System.out.println("Before Modification in st1");
        referenceCheck(st1, st2);
        st1 += "ava";
        System.out.println("After Modification");
        referenceCheck(st1, st2);
    }
}
