import java.util.*;
class StringSorter{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String l = in.nextLine();
        char[] x = new char[l.length()];
        x = l.toCharArray();
        int n = x.length;
        char swap =0;
        for (int c=0;c<(n-1);c++ ){
          for(int d=0;d<(n-c-1);d++){
                if (x[d]>x[d+1]){
                    swap = x[d];
                    x[d]=x[d+1];
                    x[d+1]=swap;
                }
            }
        }
        for(int i=0; i<n; i++)
            System.out.println(x[i]);
    }
}