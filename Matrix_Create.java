import java.util.Scanner;
class Matrix_Create
{
  Scanner scan;
  int matrix[][];
  int rows;
  int columns;
  void create(){
    scan = new Scanner(System.in);
    System.out.println("Matrix Creation");
    System.out.println("Enter the Number of rows : ");
    rows = scan.nextInt();
    System.out.println("Enter the Number of columns : ");
    columns = scan.nextInt();
    matrix = new int[rows][columns];
    System.out.println("Enter the data :- ");
    for(int i=0; i<rows; i++)
    {
      for (int j=0; j<columns ; j++ ) {
        matrix[i][j]=scan.nextInt();
      }
    }
  }
  void display()
  {
    System.out.println("The matrix is :- ");
    for(int i=0; i<rows; i++)
    {
      for (int j=0; j<columns; j++ )
      {
          System.out.print("\t"+ matrix[i][j]);
      }
      System.out.println();
    }
  }
}
class CreateDisplayMatrix
{
  public static void main(String[] args) {
    Matrix_Create obj = new Matrix_Create();
    obj.create();
    obj.display();
  }
}
