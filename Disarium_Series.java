class Disarium_Series
{
  public static void main(String[] args)
  {
     for(int i=1;i<=2000;i++)
     {
         int s=i,rem=i,rev=0,c=0,sum=0;
         while(s>0)
         {
             c++;
             s=s/10;
             
         }
         while(rem>0)
         {
             rev=rem%10;
             sum=(int)(Math.pow(rev,c))+sum;
             c--;
             rem=rem/10;
         }         
         if(sum==i)
         {
             System.out.println(sum);
         }
     }
 }
}
