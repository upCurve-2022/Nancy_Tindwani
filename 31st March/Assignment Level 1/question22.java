import java.util.Scanner;
public class question22 {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number till which you want to display the series : ");
        int n = s.nextInt();
        int a=1,b=1,c=0;
        System.out.print(a+",");
        System.out.print(b+",");
        for(int i=0;i<n;i++)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.print(b);
            if(i<n-1)
                System.out.print(",");
        }
    }
}
