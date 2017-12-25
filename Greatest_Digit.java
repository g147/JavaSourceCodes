import java.io.*;
class Greatest_Digit
{
   public static void main()throws IOException
   {
       BufferedReader Br= new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter a four-digit number:");
       int a=Integer.parseInt(Br.readLine());
       int b=0,rem=0,rev=0,rev1=0,s=0;
       int c=a; 
       while(a>0)
       {
           rem=a%10;
           b++;
           a=a/10;
       }
       if(b>3)
       {
           rev=c%10;
           s=rev+s;
           rev1=rev1+rev;
           c=c/10;
       
       System.out.print("Greatest Numeral is "+rev1);
       }
       
       else
       {
           System.out.println("Enter a four digit number");
       }
   }
}
     