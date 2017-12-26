/*
 *Fold 1-times:
   [1,2,3,4,5] -> [6,6,3]
    
   A little visualization (NOT for the algorithm but for the idea of folding):
    
    Step 1         Step 2        Step 3       Step 4       Step5
                         5/           5|         5\          
                        4/            4|          4\      
    1 2 3 4 5      1 2 3/         1 2 3|       1 2 3\       6 6 3
    ----*----      ----*          ----*        ----*        ----*
    
    
 *Fold 2-times:
   [1,2,3,4,5] -> [9,6]
    */
import java.util.*;
class FoldingArray{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of times to fold");
        int n = in.nextInt();
        int[] a = {-9,9,-8,8,66,23};
        int newLength;
        for(int i=0; i<n; i++){
            int[] d = new int[a.length];
            d=a;
            if(a.length%2!=0)
                newLength = ((a.length)/2)+1;
            else
                newLength = ((a.length)/2);
            a = new int[newLength];
            a = fold(d);
        }
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }   
    }
    public static int[] fold(int[]x){
        int newLength;
        int[] q;
        if(x.length==1){
            q = x;
        }
        else if(x.length==2){
            q = new int[1];
            q[0] = x[0]+x[1];
        }
        else if(x.length%2!=0){
            newLength = ((x.length)/2)+1;
            q = new int[newLength];
            for(int i=0; i<newLength-1; i++){
                q[i] = x[i]+x[(x.length-1)-i];
            }
            q[newLength-1]=x[((x.length-1)/2)];
        }
        else{
            newLength = ((x.length)/2);
            q = new int[newLength];
            for(int i=0; i<newLength; i++){
                q[i] = x[i]+x[(x.length-1)-i];
            }    
        }
        return q;
    }
}
