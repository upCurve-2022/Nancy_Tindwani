import java.util.Scanner;

public class question28 {
    public static void main(String args[])
    {
        int[] intArray = new int[]{ 34,56,90,12,45 };
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number which you want to search : ");
        int n = s.nextInt();
        for(int i=0;i<intArray.length;i++)
        {
            if(intArray[i]==n)
            {
                i=i+1;
                System.out.print("Found at position : " + i);
                break;}
            else
                continue;
        }

    }
}
