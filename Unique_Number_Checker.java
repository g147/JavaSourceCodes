import java.io.*;
class Unique_Number_Checker
{
  public static void main()throws IOException
  {
      BufferedReader Br=new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter a number=");
      double a=Double.parseDouble(Br.readLine());
      String s=Double.toString(a);
      int l=s.length();
      int c=0;
      for(int i=0;i<l-1;i++)
      {
          for(int j=i+1;j<l;j++)
          {
              if(s.charAt(i)==s.charAt(j))
              {
                  c++;
              }
          }
      }
      System.out.println(l);
      if(c==0)
      {
          System.out.println("It is unique");
      }
      else
      {
          System.out.println("It is not unique");
      }
  }
}