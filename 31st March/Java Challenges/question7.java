public class question7 {
    public static void main(String args[])
    {
        int Array[]=new int[]{1,2,3,4,5,6,7,8,9,10};
        float sum=0;
        for(int i=0;i<Array.length;i++)
        {
            sum=sum+Array[i];
        }
        sum=(float)sum/Array.length;
        System .out.print("Sum of array is : "+sum);
    }
}
