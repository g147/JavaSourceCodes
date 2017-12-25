import java.util.*;
class HailStoneSequence{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a Number:-");
    int num=in.nextInt();
    while (num>1) {
      if (num%2==0) {
        num/=2;
        System.out.print(num+"\t");
      }
      else{
        num=(num*3)+1;
        System.out.print(num+"\t");
      }
    }
  }
}
