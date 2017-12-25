

public class Pattern_12
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
    }
}
