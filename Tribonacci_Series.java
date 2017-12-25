class Tribonacci_Series
{
   public static void main(int n)
   {
       int t1=0,t2=1,t3=1;
       int t4=t1+t2+t3;
       System.out.print(t1+","+t2+","+t3+","+t4+",");
       for(int i=3;t4<n;i++)
       {
          t1=t2;
          t2=t3;
          t3=t4;
          t4=t1+t2+t3;
          System.out.print(t4+",");
      }
  }
}