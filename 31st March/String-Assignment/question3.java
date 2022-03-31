import java.util.*;
public class question3 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str=sc.nextLine();
        boolean result = str.matches("[0-9]+");
        if(result)
            System.out.print("String contains only digits");
        else
            System.out.print("String does not contains only digits");
    }
}
