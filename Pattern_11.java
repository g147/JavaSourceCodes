

public class Pattern_11
{
    public static void main(String[] args)
    {
        int i=1;
        while(i<=5)
        {
            int j=1;
            while(j<=i-1)
            {
                System.out.print(" ");
                j++;
            }
            int k=5;
            while(k>=i)
            {
                System.out.print(k);
                k--;
            }
            int l=i+1;
            while(l<=5)
            {
                System.out.print(l);
                l++;
            }
            i++;
            System.out.println();
        }
        int n=4;
        while(n>=1)
        {
            int j=1;
            while(j<n)
            {

                System.out.print(" ");
                j++;
            }
            int k=5;
            while(k>=n)
            {
                System.out.print(k);

                k--;
            }
            int l=n+1;
            while(l<=5)
            {
                System.out.print(l);
                l++;
            }
            n--;
            System.out.println();

        }
    }
}
