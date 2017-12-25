public class Pattern
{
    public static void main()
    {
        for(int i=5;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            if(i<=4)
            {
                System.out.print(" ");
            }
            if(i<=3)
            {
                for(int k=4-i;k>=1;k--)
                {
                    System.out.print(k);
                }
            }

            if(i<=2)
            {
                for(int k=2;k<=4-i;k++)
                {
                    System.out.print(k);

                }
            }
            if(i<=3)
            {
                System.out.print(" ");
            }
            for(int l=i; l>=1; l--)
            {
                if(l==5)
                    System.out.print(l=l-1);
                else
                    System.out.print(l);

            }

            System.out.println();



        }
        for(int i=2;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            if(i<=4)
            {
                System.out.print(" ");
            }
            if(i<=3)
            {
                for(int k=4-i;k>=1;k--)
                {
                    System.out.print(k);
                }
            }

            for(int k=2;k<=4-i;k++)
            {
                System.out.print(k);

            }
            if(i<=3)
            {
                System.out.print(" ");
            }
            for(int l=i; l>=1; l--)
            {
                if(l==5)
                    System.out.print(l=l-1);
                else
                    System.out.print(l);

            }

            System.out.println();



        }
    }
}

