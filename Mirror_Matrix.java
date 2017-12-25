import java.util.*;
class Mirror_Matrix{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if(x<2||x>20)
            System.out.println("Wrong Input");
        else{
            int[][] a = new int[x][x];
            for(int i=0; i<x; i++){
                for(int j=0; j<x; j++){
                    a[i][j] = in.nextInt();
                }
            }
            int[][] b = new int[x][x];
            for(int i=0; i<x; i++){
                for(int j=0; j<x; j++){
                    b[i][j] = a[i][(x-1)-j];
                }
            }
            System.out.println("Orignal Matrix :-");
            System.out.println();
            for(int i=0; i<x; i++){
                for(int j=0; j<x; j++){
                    System.out.print(a[i][j]+"  ");
                }
                System.out.println();
            }
            System.out.println("Mirror Matrix :-");
            System.out.println();
            for(int i=0; i<x; i++){
                for(int j=0; j<x; j++){
                    System.out.print(b[i][j]+"  ");
                }
                System.out.println();
            }
        }
    }
}