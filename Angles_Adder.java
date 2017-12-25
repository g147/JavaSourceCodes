import java.io.*;
class Angles_Adder
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the 1st degree and minute  with space in between");
        String s1=br.readLine();
        System.out.println("Enter the 2st degree and minute with space in between");
        String s2=br.readLine();
        int l=s1.indexOf(' ');int z=0;
        int x=s2.indexOf(' ');int y=0;
        String s=s1.substring(0,l);int n=Integer.parseInt(s);
        String ss=s1.substring((l+1));int n1=Integer.parseInt(ss);
        String a=s2.substring(0,x);int b=Integer.parseInt(a);
        String aa=s2.substring((x+1));int b1=Integer.parseInt(aa);
        z=n1+b1;
        y=n+b;
        if(z>60)
        {
            y++;
            z=z%60;
        }
        System.out.println("The Sum of angles:"); 
        System.out.println(y+" degrees "+z+" minute");  
    }
}
