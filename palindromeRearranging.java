import java.util.*;
public class palindromeRearranging{
	public static void main(String[] args){
		boolean r=true;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string");
		String x = in.next();
		int l = x.length();
		int[] a = new int[26];
		a = createArray(x);
		int count=0;
		if(l%2==0){
			for(int i=0; i<a.length; i++){
				if(a[i]!=0&&a[i]%2!=0){
					r = false;
					break;
				}
			}
		}
		
		else{
			for(int i=0; i<a.length; i++){
				if(a[i]!=0&&a[i]%2!=0){
					count++;
				}
			}
			if(count>1){
					r=false;
				}
		}
		System.out.println(r);
	}
	public static int[] createArray(String x){
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
		
