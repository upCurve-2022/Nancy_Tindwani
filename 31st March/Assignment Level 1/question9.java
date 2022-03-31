import java.util.Scanner;
public class question9 {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        int number = s.nextInt();
        int rev=0;
        int r;
        while(number>0) {
            r =number % 10;
            number = number / 10;
            rev = rev * 10 + r;
        }
        System.out.print("Reverse number : "+rev);
    }
}
