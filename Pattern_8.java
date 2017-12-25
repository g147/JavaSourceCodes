


public class Pattern_8
{
    public static void main(String[] args)
    {
        int m=5;
        int i=1;
        while(i<=5)
        {
            int j=1;
            while(j<=m)
            {
                System.out.print("  ");
                j++;
            }
            int k=i;
            while(k>=1)
            {
                System.out.print(k+" ");
                k--;
            }
            int l=2;
            while(l<=i)
            {
                System.out.print(l+" ");
                l++;
            }
            i++;
            System.out.println();
            m=m-1;
        }
         m=2;
         int n=4;
        while(n>=1)
        {
            int j=1;
            while(j<=m)
            {
                System.out.print("  ");
                j++;
            }
            int k=n;
            while(k>=1)
            {
                System.out.print(k+" ");
                k--;
                
            }
            int l=n-1;
            while(l>=1)
            {
                System.out.print(l+" ");
                l--;
            }
            n--;
            System.out.println();
            m=m+1;
        }
    }
}
