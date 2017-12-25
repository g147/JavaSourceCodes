

public class Pattern_3
{
    public static void main(String[] Args)
    {
        int m=5;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=m;j++)
            {
                System.out.print("  ");
            }
            for(int k=i;k>=1;k--)
            {
                System.out.print(k+" ");
            }
            for(int l=2;l<=i;l++)
            {
                System.out.print(l+" ");
            }
            System.out.println();
            m=m-1;
        }
         m=2;
        for(int i=4;i>=1;i--)
        {
            for(int j=1;j<=m;j++)
            {
                System.out.print("  ");
            }
            for(int k=i;k>=1;k--)
            {
                System.out.print(k+" ");
            }
            for(int l=i-1;l>=1;l--)
            {
                System.out.print(l+" ");
            }
            System.out.println();
            m=m+1;
        }
    }
}
