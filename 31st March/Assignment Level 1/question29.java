import java.util.Scanner;
public class question29 {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number which you want to search: ");
        int n = s.nextInt();
        int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
        int length=intArray.length;
        int low=0,high=intArray.length-1,f=0;
        int mid=0;
        while(high>=low)
        {
            mid=low+(high-low)/2;
            if(n==intArray[mid])
            {
                mid=mid+1;
                f=1;
                break;
            }
            else if(n>intArray[mid])
            {
                low = mid + 1;
                continue;
            }
            else
            {
                high=mid-1;
                continue;
            }

        }
        if(f==1)
            System.out.print("Found at : "+mid);
        else
            System.out.print("Not Found");

    }
}
