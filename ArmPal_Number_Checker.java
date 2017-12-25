import java.io.*;
class ArmPal_Number_Checker
{
   public static void main()throws IOException
   {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter the number");
       int a=Integer.parseInt(br.readLine());
       int b=a,rem=0,rev=0,rem1=0,rev1=0;
       while(a>0)
       {
           rem=a%10;
           rev=rev+(rem*rem*rem);
           rev1=10*rev1+rem;
           a=a/10;
       }
      if(rev==b)
      {
          System.out.println("It is armstrong");
      }
      if(rev1==b)
      {
          System.out.println("It is palindrome");
      }
      
}
}