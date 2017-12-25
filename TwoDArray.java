import java.util.*;
class TwoDArray
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the Number of rows...");
    int rows = in.nextInt();
    System.out.println("Enter the Number of columns...");
    int columns = in.nextInt();
    int[][] dda = new int[rows][columns];
    System.out.println("Enter "+rows+" x "+columns+" = "+(rows*columns)+" integers: ");
    for(int i=0; i<rows; i++)
    {
      for(int j=0; j<columns; j++)
      {
        dda[i][j] = in.nextInt();
      }
    }
    System.out.println("Here are those "+(rows*columns)+" integers in a "+rows+" x "+columns+" 2-Dimensional array:");
    System.out.println(Arrays.deepToString(dda));
  }
}
