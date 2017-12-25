
public class Pattern_10
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
    }
}
