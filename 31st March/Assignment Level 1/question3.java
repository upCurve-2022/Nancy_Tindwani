import java.util.*;
public class question3 {
    public static void main(String args[]){
        Scanner scan = new Scanner( System.in );
        System.out.print("Enter the principal value : ");
        float P = scan.nextFloat();
        System.out.print("Enter the rate of interest value : ");
        float R = scan.nextFloat();
        System.out.print("Enter the time value : ");
        float T = scan.nextFloat();
        float SI;
        SI=(P*R*T)/100;
        System.out.print("Simple Interest : "+SI);
    }
}
