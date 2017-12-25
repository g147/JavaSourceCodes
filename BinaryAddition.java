import java.util.*;
class BinaryAddition{
  public static void main(String[] args) {
    int a, b;
    Scanner in = new Scanner(System.in);
    System.out.println("Please Input two Binary Numbers to add...");
    a=in.nextInt();
    b=in.nextInt();
    int k=1;
    int dec1=0, dec2=0;
    while(a!=0){
      dec1 = dec1+(a%10)*k;
      k=k*2;
      a=a/10;
    }
    while(b!=0){
      dec2 = dec2+(b%10)*k;
      k=k*2;
      b=b/10;
    }
    int sum=dec1+dec2;
    String s = Integer.toBinaryString(sum);
    System.out.println(s);
  }
}
