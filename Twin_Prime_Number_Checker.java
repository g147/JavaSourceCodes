import java.io.*;
class Twin_Prime_Number_Checker
{
  public static void main()throws IOException
  {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter the first number: ");
      int n=Integer.parseInt(br.readLine());
      int m=n+2;
      System.out.println(m);
      int div=0;
      for(int i=2;i<=(n/2);i++)
      {
         if(n%i==0||m%i==0)
         {
             div++;
         }
     }
     if(div>0)
     {
         System.out.println("It is not twin prime");
     }
     else
     {
         System.out.println("It is twim prime");
     }
 }
}