import java.util.Scanner;
public class question18 {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of which you want to calculate factorial  : ");
        int n = s.nextInt();
        int m=1;
        for(int i=2;i<=n;i++)
        {
            m=m*i;
        }
        System.out.print("Factorial is : "+m);
    }
}
