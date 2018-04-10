import java.util.*;
public class anagram{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i=1; i<=t; i++){
			String a = in.next();
			String b = in.next();
			a = a.toLowerCase();
			b = b.toLowerCase();
			int[] ax = new int[26];
			int[] bx = new int[26];
			ax = giveArray(a);
			bx = giveArray(b);
			int sum=0;
			for(int j=0; j<26; j++){
				if(ax[j]!=bx[j])
					sum = sum+Math.abs(ax[j]-bx[j]);
			}
			System.out.println(sum);
		}
	}
	public static int[] giveArray(String x){
		int[] y = new int[26];
		for(int i=0; i<y.length; i++)
			y[i]=0;
		for(int i=0; i<x.length(); i++){
			char u = x.charAt(i);
			int v = (int)u;
			y[v-97]=y[v-97]+1;
		}
		return y;
	}
}
