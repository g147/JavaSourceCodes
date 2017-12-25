


public class Pattern_2
{
    public static void main(String[] Args)
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i-1;j++)
            {
                System.out.print(" ");
            }
            for(int k=5;k>=i;k--)
            {
                System.out.print(k);
            }
            for(int l=i+1;l<=5;l++)
            {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
