import java.util.*;
public class AutomorphicNumbers{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int input=in.nextInt();
    int square=input*input;
    String inputAsString=input+"";
    String squareAsString=square+"";
    if (squareAsString.endsWith(inputAsString)) {
      System.out.println("It is Automorphic Number.");
    }
    else{
      System.out.println("It is not an Automorphic Number.");
    }
  }
}
