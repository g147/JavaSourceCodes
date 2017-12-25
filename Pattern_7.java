
public class Pattern_7
{
    public static void main(String[] args)
    {
        int u=5;
        do
        {
            int j=1;
            do
            {
                System.out.print(j);
                j++;
            }
            while(j<=u);

            int k=1;
            do
            {
                if(k>2)
                    System.out.print("  ");
                else if(k==2)
                    System.out.print(" ");

                k++;
            }
            while(k<=6 -u);
            int l=u;
            do
            {
                if(l==5)
                    System.out.print(l=l-1);
                else
                    System.out.print(l);
                l--;
            }
            while(l>=1);
            u--;
            System.out.println();
        }
        while(u>=1);
    }
}
