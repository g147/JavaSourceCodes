public class Armstrong_Series
{
    public static void main(String[] args)
    {
        for(int n=1; n<=1000; n++)
        {
            int sum=0;
            int num=n;
            while(num>0)
            {
                int rem=num%10;
                sum=sum+(rem*rem*rem);
                num=num/10;
            }
            if(n==sum)
            System.out.println(n);
        }
    }
}
