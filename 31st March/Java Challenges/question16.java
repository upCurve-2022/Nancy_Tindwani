import java.util.Scanner;

public class question16 {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = s.next();
        int count;
        char string[] = str.toCharArray();

        System.out.println("Duplicate characters in a given string: ");
        //Counts each character present in the string
        for(int i = 0; i <string.length; i++) {
            count = 1;
            for(int j = i+1; j <string.length; j++) {
                if(string[i] == string[j] && string[i] != ' ') {
                    count++;
                    string[j] = '0';
                }
            }
            //A character is considered as duplicate if count is greater than 1
            if(count > 1 && string[i] != '0')
                System.out.println(string[i]);
        }
    }
}
