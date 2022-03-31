import static java.lang.Math.pow;
import java.util.Scanner;
public class question23 {
    public static void main(String args[])
    {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the range: ");
                int num = sc.nextInt();
                int even = 1, oddsum = 1;
                for(int i = 0; i <= num; i++)
                {
                    if(i%2!=0){
                        System.out.print(even*(-2)+" ");
                        even += 2;
                    }
                    else{
                        System.out.print(oddsum+" ");
                        oddsum += 3;
                    }
                }
    }
}
