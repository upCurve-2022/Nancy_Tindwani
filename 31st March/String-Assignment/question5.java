import java.util.Scanner;

public class question5 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str=sc.nextLine();
        boolean result = str.isEmpty();
        if(result)
            System.out.print("String is empty");
        else
            System.out.print("Length of String : "+str.length());
    }
}
