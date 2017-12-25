import java.util.*;
public class DuckNumber{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a number: ");
    String n=in.nextLine();
    int l=n.length();
    int c=0;
    char ch;
    for (int i=1;i<l;i++) {
      ch=n.charAt(i);
      if(ch=='0')
        c++;
    }
    char f = n.charAt(0);
    if(c>0 && f!=0)
      System.out.println("Duck Number.");
    else
      System.out.println("Not a Duck Number.");
  }
}
