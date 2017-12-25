import java.io.*;
class Palindrome_Word_Checker
{
   public static void main(String[] args)throws IOException
   {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter your word:");
       String s=br.readLine();
       String d="";
       int a=s.length();
       for(int i=a-1;i>=0;i--)
       {
           char b=s.charAt(i);
           d=d+b;
           s=s+d;
       }
       System.out.print("The palindrome word:"+s);
   }
}
