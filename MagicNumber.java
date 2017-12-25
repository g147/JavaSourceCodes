import java.util.*;
class MagicNumber{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int sum=0, flag, d=0;
    do{
      flag=0;
      while(n%10==0){
        n/=10;
      }
      while (n%10!=0||n>0) {
        sum+=(n%10);
        n/=10;
      }
      if(sum>=10){
        n=sum;
        sum=0;
      }
      else
        flag=1;
    }while(flag==0);
    if(sum==1)
      System.out.println("Magic Number.");
    else
      System.out.println("Not a Magic Number.");
  }
}
