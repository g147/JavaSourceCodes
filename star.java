import java.util.Scanner;
public class star {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x= 4;
        for(int i=1; i<=x; i++){
            for(int j=x-1; j>=i; j--){
                System.out.print(" ");
            }
            for(int j=1; j<=(i*2)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
