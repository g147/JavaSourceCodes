import java.util.*;
public class commonCharacterCount{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter The Strings");
		String a = in.nextLine();
		String b = in.nextLine();
		a = a.toLowerCase();
		b = b.toLowerCase();
		int[] ax = getAlphas(a);
		int[] bx = getAlphas(b);
		int result=0;
		for(int i=0; i<26; i++){
			if(ax[i]>=0&&bx[i]>=0){
				if(ax[i]<=bx[i])
					result=result+ax[i];
				else
					result=result+bx[i];
			}
		}
		System.out.println("Total Common Characters: "+result);
	}
	public static int[] getAlphas(String x){
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
	
