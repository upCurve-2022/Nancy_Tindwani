import java.util.*;
public class question4 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
        System.out.print("Enter first number- ");
        int a= sc.nextInt();
        System.out.print("Enter first number- ");
        int b= sc.nextInt();
        System.out.println("Swapping Two Numbers : a="+a+" b="+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("Swapped Numbers : a= "+a+" b= "+b);
        System.out.print("Enter first number- ");
        int a1= sc.nextInt();
        System.out.print("Enter first number- ");
        int b1= sc.nextInt();
        System.out.print("Enter first number- ");
        int c1= sc.nextInt();
        System.out.println("Swapping Three Numbers : a="+a1+" b="+b1+" c="+c1);
        a1 = a1 + b1 + c1;
        b1 = a1 - (b1+c1);
        c1 = a1 - (b1+c1);
        a1 = a1 - (b1+c1);
        System.out.println("Swapped Numbers : a="+a1+" b="+b1+" c="+c1);
    }
}
