import java.util.*;
public class question14 {
    public static void main(String args[]) {
        int n;
        System.out.print("Enter a number:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int seq[] = new int[n];
        seq[0] = 1;
        seq[1] = 4;
        seq[2] = 7;
        System.out.print(seq[0] + ", " + seq[1] + ", " + seq[2] + ", ");
        for (int i = 3; i < n; i++) {
            seq[i] = seq[i - 1] + seq[i - 2] + seq[i - 3];
            if (i == n - 1)
                System.out.print(seq[i]);
            else
                System.out.print(seq[i] + ", ");
        }
    }
}