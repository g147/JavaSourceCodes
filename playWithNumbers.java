import java.util.*;
public class playWithNumbers{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int k = in.nextInt();
		int[] a = new int[x];
		for(int i=0; i<x; i++){
			a[i] = in.nextInt();
		}
		for(int i=1; i<=k; i++){
			int u = in.nextInt();
			int v = in.nextInt();
			int e = (v-u)-1;
			int sum = 0;
			for(int j=u; j<v-1; j++){
				sum=sum+a[j];
			}
			if(e!=0)
				System.out.println(sum/e);
		}
	}
}
