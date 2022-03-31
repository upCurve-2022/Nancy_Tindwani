import java.util.Scanner;

public class question11 {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number till which you want to display the series :");
        int n = s.nextInt();
        for (int i = 2; i <= n; i = i + 2) {
            System.out.print((i * i) + " ");
        }
    }
}
