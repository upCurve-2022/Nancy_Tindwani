import java.util.Scanner;

public class question17 {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number  : ");
        int n = s.nextInt();
        System.out.print("Enter the second number : ");
        int m = s.nextInt();
        int f=0;
        for(int i=n;i<=m;i++)
        {
            f=0;
            if(i>2)
            {
                for(int j=2;j<i;j++)
                {
                    if(i%j==0)
                        f=f+1;
                    else
                        continue;
                }
                if(f>0)
                   continue;
                else
                    System.out.print("Prime number between m and n is : "+i+" ");
            }
            else if(i==2)
                System.out.print("Prime number between m and n is : "+i+" ");
            else
                continue;
        }
    }
}
