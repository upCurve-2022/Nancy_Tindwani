import java.util.Scanner;
public class question8 {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number till which you want to find the sum :");
        int N = s.nextInt();
        int s1=0;
        int s2=0;
        for(int i=1;i<=10;i++)
        {
            if(i%2==0)
            {
                s1=s1+i;
            }
            else
                s2=s2+i;
        }
        System.out.println("Even Sum : "+s1);
        System.out.println("Odd Sum : "+s2);
    }
}
