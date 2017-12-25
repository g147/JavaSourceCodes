import java.io.*;
public class Short_Name_Printer
{
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Full Name:");
        String s=br.readLine();
        int l=s.length();
        char b;b=0;
        int d=0;
        String st2,st3;st3="";st2="";
        st2=st2+s.charAt(0);
        for(int i=0;i<l;i++)
        {
            b=s.charAt(i);
            if(b==' ')
            {
                d=d+1;
                if(d==1)
                {
                    st3=st2+"."+(s.charAt(i+1));
                }
                if(d==2)
                {
                    st3=st3+"."+(s.charAt(i+1));
                }

            }
        }
        System.out.println("Short name:   "+st3);
    }
}
