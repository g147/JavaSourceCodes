import java.util.*;
public class BuzzNumber{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int a=in.nextInt();
    if(a%10==7||a%7==0){
      System.out.println("Entered number is a Buzz Number.");
    }
    else{
      System.out.println("Entered number is not a Buzz Number.");
    }
  }
}
