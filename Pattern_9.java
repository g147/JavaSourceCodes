


public class Pattern_9
{
    public static void main(String[] args)
    {
        int u=5;
        while( u>=1 )
        {
            int j=1;
            while(j<=u)
            {
                System.out.print(j);
                j++;
            }
            int k=1;
            while(k<=6-u)
            {
                if(k>2)
                    System.out.print("  ");
                else if(k==2)
                    System.out.print(" ");
                k++;
            }
            int l=u;
            while( l>=1)
            {
                if(l==5)
                    System.out.print(l=l-1);
                else
                    System.out.print(l);
                l--;
            }
            u--;
            System.out.println();
        }
        int n=2;
        while( n<=5)
        {
            int j=1;
            while( j<=n)
            {
                System.out.print(j);
                j++;
            }
            int k=1;
            while( k<=6-n)
            {
                if(k==2)
                    System.out.print(" ");
                if(k>2)
                    System.out.print("  ");
                k++;
            }
            int l=n;
            while(l>=1)
            {
                if(l==5)
                    System.out.print(l=l-1);
                else
                    System.out.print(l);
                l--;
            }
            n++;
            System.out.println();
        }

    }
}
