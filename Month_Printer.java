import java.io.*;
class Month_Printer
{
   public static void main()throws IOException
   {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter the month number from 1 to 12:");
       int n=Integer.parseInt(br.readLine());
       switch(n)
       {
           case 1:
           System.out.println("JANUARY");
           break;
           case 2:
           System.out.println("FEBRUARY");
           break;
           case 3:
           System.out.println("MARCH");
           break;
           case 4:
           System.out.println("APRIL");
           break;
           case 5:
           System.out.println("MAY");
           break;
           case 6:
           System.out.println("JUNE");
           break;
           case 7:
           System.out.println("JULY");
           break;
           case 8:
           System.out.println("AUGUST");
           break;
           case 9:
           System.out.println("SEPTEMBER");
           break;
           case 10:
           System.out.println("OCTOBER");
           break;
           case 11:
           System.out.println("NOVEMBER");
           break;
           case 12:
           System.out.println("DECEMBER");
           break;
           default:
           System.out.println("Wrong Input");
       }
   }
}