

public class Pattern_13
{
    public static void main(String[] args)
    {
        int m=5;
        int i=1;
        do
        {
            int j=1;
            do
            {
                System.out.print("  ");
                j++;
            }
            while(j<=m);
            int k=1;
            do
            {
                System.out.print(k+" ");
                k++;
            }
            while(k<=i);
            if(i!=1)
            {
                int l=i-1;
                do
                {
                    System.out.print(l+" ");
                    l--;
                }
                while(l>=1);
            }
            i++;
            System.out.println();
            m=m-1;
        }
        while(i<=5);
        m=4;
        int n=4;
        do
        {
            int j=1;
            do
            {
                if(n==4)
                {
                    System.out.print("  ");
                    m--;
                }
                else

                    System.out.print("  ");
                j++;
            }
            while(j<=m);
            int k=1;
            do
            {
                System.out.print(k+" ");
                k++;
            }
            while(k<=n);
            if(n!=1)
            {
                int l=n-1;
                do
                {

                    System.out.print(l+" ");
                    l--;
                }
                while(l>=1);
            }
            n--;
            System.out.println();
            m=m+1;
        }
        while(n>=1);
    }
}
