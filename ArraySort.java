import java.util.Arrays;
class ArraySort
{
  public static void main(String[] args)
  {
      String iArr[] = {"We","are","anonymous"};
      Arrays.sort(iArr);
      System.out.println("The sorted array is :- ");
      for(String a:iArr)
      {
          System.out.println(a);
      }
  }
}
