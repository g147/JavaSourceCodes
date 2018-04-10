import java.util.*;
public class stringSum{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String a = in.next();
        int k = giveSum(a);
        System.out.println(k);

    }
    public static int giveSum(String x){
        int sum =0;
		for(int i=0; i<x.length(); i++){
			char u = x.charAt(i);
			int v = (int)u;
			sum = sum + (v-96);
		}
		return sum;
	}
}