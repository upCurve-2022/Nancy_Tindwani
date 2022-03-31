public class question18 {
    public static void main(String args[])
    {
        int a=45,b=90,c=23,largest;
        largest = a > b ? (a > c ? a : c) : (b > c ? b : c) ;
        System.out.print("Largest number is : "+largest);
    }
}
