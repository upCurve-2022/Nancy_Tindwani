import java.lang.*;
import java.util.*;
public class question2 {
    private static Scanner sc;
    public static void main(String args[])
    {
        String stringToDeleteChar;
        char deleteChar;
        sc = new Scanner(System.in);
        System.out.print("Please Enter String to Delete All Characters =  ");
        stringToDeleteChar = sc.nextLine();

        System.out.print("Enter the Character to Delete =  ");
        deleteChar = sc.next().charAt(0);

        String out = stringToDeleteChar.replace(deleteChar, Character.MIN_VALUE);
        System.out.println("The Final String after deleting character " +
                deleteChar + " is " + out);
    }
}
