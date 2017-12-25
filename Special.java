public class Special
{
    public static void main(String[] args)
    {

        for(int n=1; n<=10000; n++)
        {
            int l=n;

            int sum=0;
            while(l>0)
            {
                int rem=l%10;
                int fact=1;
                for(int x=1;x<=rem;x++)
                {
                    fact=fact*x;
                }
                
                sum=sum+fact;
                l=l/10;
            }

            if (n==sum)
                System.out.println(n);
        }
    }
}
