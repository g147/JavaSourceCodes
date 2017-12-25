import java.io.*;
import java.util.*;
public class AdamNumber{
  int CountNumberOfDigits(int n){
    int numdigits=0;
    do{
      n=n/10;
      numdigits++;
    }while(n>0);
    return numdigits;
  }
  int ReverseNumber(int n){
    int i=0, result=0;
    int numdigits = CountNumberOfDigits(n);
    for(i=0; i<numdigits; i++){
      result*=10;
      result+=n%10;
      n=n/10;
    }
    return result;
  }
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the minimum number of range :-");
    int min=in.nextInt();
    System.out.println("Enter the maximum number of range :-");
    int max=in.nextInt();
    AdamNumber an=new AdamNumber();
    System.out.println("Adam Numbers are :-");
    for(int i=min; i<max; i++){
      int n=i;
      int rn=an.ReverseNumber(i);
      if(n==rn){
        continue;
      }
      int sqrn=n*n;
      int sqrm=rn*rn;
      int revsqrm=an.ReverseNumber(sqrm);
      if (revsqrm==sqrn) {
        System.out.print(n+"\n");
      }
    }
    System.out.println();
  }
}
