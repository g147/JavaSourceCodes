public class Perfect_Series
{
    public static void main()
    {
        for(int i=1; i<=100; i++)
        {
            int x=0;
            int fact=0;
            for(int n=1; n<=i; n++)
            {
                fact=fact+n;
                if(fact==i)
                x++;
            }
            if(x==1)
            System.out.println(i);
        }
    }
}