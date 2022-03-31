import java.util.*;
public class question16 {
    public static void main(String args[])
    {
        int n;
        System.out.print("Enter a number:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int sum = 1, d=0;
        for(int i=0; i<n; i++){
            if(i==n-1)
                System.out.print(sum);
            else
                System.out.print(sum+", ");
            if(i==1 || i==0)
                d = d + 4;
            else
            {
                if(i%2==0)
                    d = d + 8;
                else
                    d = d + 4;
            }

            sum = sum + d;

        }
    }
}
