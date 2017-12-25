public class Neon_Series
{
    public static void main(String[] args)
    {
        for(int n=1; n<=1000; n++)
        {
            int p,s,d=0;
            s=0;
            p=n*n;
            do
            {
                d=p%10;
                s=s+d;
                p=p/10;
            }
            while(p!=0);
            if(s==n)
            System.out.println(n);
        }
    }
}
