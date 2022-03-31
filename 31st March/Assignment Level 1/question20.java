import java.lang.Math;
import java.util.Scanner;
public class question20 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number  : ");
        int number = s.nextInt();
        int power = 0;
        int num=0;
        while (number != 0) {
            int r = number % 10;
            num = num + (r * (int)Math.pow(2, power));
            number=number/10;
            power = power + 1;
        }
        System.out.print("Decimal number is : "+num);
    }
}
