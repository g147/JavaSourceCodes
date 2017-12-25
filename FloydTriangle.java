import java.util.Scanner;
class FloydTriangle{
  public static void main(String[] args) {
    int num=1, n, c, d;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the nuumber of rows");
    n=in.nextInt();
    for (c=1;c<=n ;c++ ) {
      for (d=1;d<=c ;d++ ) {
        System.out.print(num+" ");
        num++;
      }
      System.out.println();
    }
  }
}
