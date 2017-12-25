import java.io.*;
class Calculator
{
  static int a,b,c;
  Calculator()
  {
      a=0;
      b=0;
}
  int add(int x,int y)
  {
      return(x+y);
  }
  int sub(int x,int y)
  {
      return(x-y);
  }
  double div(int x,int y)
  {
      return(x/y);
  }
  int multiply(int x,int y)
  {
      return(x*y);
  }
  public static void main(String[] args)throws IOException
  {
      Calculator ob=new Calculator();
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter your 2 numbers:");
      a=Integer.parseInt(br.readLine());
      b=Integer.parseInt(br.readLine());
      System.out.println("Enter your choice:");
      System.out.println("1. Addition");
      System.out.println("2. Subtraction");
      System.out.println("3. Division");
      System.out.println("4. Multiplication");
      c=Integer.parseInt(br.readLine());     
      switch(c)
      {
          case 1:
          System.out.println("Sum=" + ob.add(a,b));
          break;
          case 2:
          System.out.println("Difference="+ob.sub(a,b));
          break;
          case 3:
          System.out.println("Division="+ob.div(a,b));
          break;
          case 4:
          System.out.println("Multiplication:"+ob.multiply(a,b));
          break;
          default:
          System.out.println("Invalid Choice");
      }
  }
}
