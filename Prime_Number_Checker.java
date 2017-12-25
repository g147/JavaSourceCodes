public class Prime_Number_Checker
{
    public static void main(double n)
    {
        int a,o,c=0;
        for(a=1;a<=n;a++)
        {
            if(n%a==0)
                c=c+1;
        }
        if(c==2)
            System.out.println(+n+" is a Prime Number");
        else
            System.out.println(+n+" is not a Prime Number");
    }
}