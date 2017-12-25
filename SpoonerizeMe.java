import java.io.*;
import java.util.*;
public class SpoonerizeMe{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String l = in.nextLine();
        StringTokenizer data = new StringTokenizer(l);
        int num = data.countTokens();
        String[] u = new String[num];
        for(int i=0; i<num;i++){
            u[i] = data.nextToken();
        }
        for(int i=0; i<num-1;i++){
            System.out.print(u[i+1].charAt(0)+u[i].substring(1)+" "+u[i].charAt(0)+u[i+1].substring(1));
        }
    }
}