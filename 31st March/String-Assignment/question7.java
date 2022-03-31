import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class question7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String :");
        String str=sc.next();
        boolean x=Character.isDigit(str.charAt(0));
        boolean y=Character.isDigit(str.charAt(1));
        boolean z=Character.isDigit(str.charAt(2));
        char st2[] =str.toCharArray();
        char hyp='-';
        if (str.length()<3){
            System.out.println("Final String :"+str);
        }
        else {
            int flag=0;
            for (int i = 1; i <= str.length() - 2; i++) {
                if (st2[i] == hyp) {
                    if ((x == true) && (z == true)) {
                        st2[i] = 0;
                        flag=1;
                    }
                }
                if (i != str.length() - 2) {
                    x = Character.isDigit(str.charAt(i));
                    z = Character.isDigit(str.charAt(i + 2));
                }
            }
            if (flag==0)
                System.out.println("Final String: " + str);
            else
                System.out.println("Final String"+ st2);
        }

    }
}

