import java.util.*;
public class question14 {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str= sc.nextLine();
        System.out.print("Enter second string: ");
        String str1= sc.nextLine();
        boolean result=str1.contains(str);
        if(result)
        {
            System.out.print(str+" "+"is in"+" "+str1);
        }
        else
            System.out.print(str+" "+"is not in"+" "+str1);
    }
}
