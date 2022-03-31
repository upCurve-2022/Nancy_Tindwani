import java.util.Scanner;
public class question6 {
    public static void main(String args[])
    {
        Scanner scan = new Scanner( System.in );
        System.out.print("Enter the principal value : ");
        float doubleNumber = scan.nextFloat();
        String doubleAsString = String.valueOf(doubleNumber);
        int indexOfDecimal = doubleAsString.indexOf(".");
        System.out.println("Double Number: " + doubleNumber);
        System.out.println("Integer Part: " + doubleAsString.substring(0, indexOfDecimal));
        System.out.println("Decimal Part: " + doubleAsString.substring(indexOfDecimal+1));
    }
}
