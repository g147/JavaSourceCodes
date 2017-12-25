public class exp
{
    public static void main(int n)
    {
        double fact=1;
        double sum=0;
        for(double i=1;i<=n;i++)
        {
            for(double x=1;x<=i;x++)
            {
                fact=fact*x;
            }
            if(n%2==0)
            {
                sum=sum-(i/fact);
            }
            else
            {
                sum=sum+(i/fact);
            }
        }
        System.out.println(sum);
    }
}