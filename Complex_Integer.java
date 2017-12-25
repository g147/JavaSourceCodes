import java.io.*;
class Complex_Integer
{
   public static void main(String[] args)throws IOException
   {
       int even=0,even1=0,odd=0,odd1=0,c=0,d=0,max=0,min=0,n=0;
       int maxx=0;
       int minn=0;
       BufferedReader Br=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter the numbers:");
       int m=Integer.parseInt(Br.readLine());
       min=m;max=m;
       
       if(m%2==0)
       {
           c++;
           even=even+m;
           even1=even/c;
       }
       if(m%2!=0)
       {
           d++;
           odd=odd+m;
           odd1=odd/d;
       }
       for(int i=2;i<=10;i++)
       {
           n=Integer.parseInt(Br.readLine());
           minn=n;maxx=n;
           if(n%2==0)
           {
               c++;
               even=even+n;
               even1=even/c;
           }
           if(n%2!=0)
           {
               d++;
               odd=odd+n;
               odd1=odd/d;
           }
          
         if(min>n)
         min=n;
         if(max<n)
         max=n;
         if(minn>min&&minn>m)
         minn=n;
         if(maxx<max&&maxx>m)
         maxx=n;
         
       }
       int dif=even-odd;
       System.out.println("Sum of even:"+even);
       System.out.println("Count of even:"+c);
       System.out.println("Average of even:"+even1);
       System.out.println("Sum of odd:"+odd);
       System.out.println("Count of odd:"+d);
       System.out.println("Average of odd:"+odd1);
       System.out.println("Difference :"+dif);
       System.out.println("Greatest number:"+max);
       System.out.println("Smallest number:"+min);
       System.out.println("2nd Greatest number:"+maxx);
       System.out.println("2nd Smallest number:"+minn);
   }
}
       
