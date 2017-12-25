import java.io.*;
class Number_Sorter
{
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 5 numbers to sort ");
        int n[]=new int[5];
        int p=0;
        for(int i=0;i<5;i++)
        {
            n[i]=Integer.parseInt(br.readLine());
        }
        for(int i=0;i<4;i++)
        {
            for(int j=(i+1);j<5;j++)
            {
                if(n[i]>n[j])
                {
                    p=n[i];
                    n[i]=n[j];
                    n[j]=p;
                }
            }
        }
        System.out.println("The sorted order: ");
        for(int i=0;i<5;i++)
        {
            System.out.println(n[i]);

        }
    }
}