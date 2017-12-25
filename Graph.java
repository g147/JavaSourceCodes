import java.util.Scanner;
public class Graph{
  public static void main(){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the numeral");
    long num = in.nextInt();
    long copy = num;
    while(copy>0){
      long rem=num%10;
      System.out.println(":");
      for(int i=0;i<=rem;i++){
        System.out.print("*");
      }
      num=num/10;
    }
  }
}
