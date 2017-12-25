import java.util.*;
public class Shift{
    
    int[][] mat; //stores the array element.
    int m; //integer to store the number of rows.
    int n; //integer to store the number of columns.
    //parameterized constructors to initialize the data members.
    Shift(int mm, int nn){
        m=mm; // initializing rows.
        n=nn; // initializing columns.
        mat = new int[m][n]; //initializing array.
    }
    
    //enters the elements of the array.
    public void input(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the elements");
        for(int i=0; i<m; i++){
            for(int j=i; j<n; j++){
                mat[i][j] = in.nextInt();
            }
        }
    }
    
    //display the matrix elements.
    void display(){
        for(int i=0;i<m;i++){
            System.out.println();
            for(int j=0;j<n;j++)
                System.out.print(mat[i][j] +"\t");
        }
    }
    
    //Cyclic shifter.
    public void cyclic(Shift P){
            for(int i=0; i<m; i++){
                for(int j=i; j<n; j++){
                    if(i!=0)
                        mat[i-1][j] = P.mat[i][j];
                    else
                        mat[m-1][j] = P.mat[0][j];
                }
            }
    }
    
    //main() function.
    public static void main(String[] args){
        Shift x=new Shift(3,4);
        Shift y=new Shift(3,4);
        x.input();
        y.cyclic(x);
        x.display();
        y.display();
    }
}