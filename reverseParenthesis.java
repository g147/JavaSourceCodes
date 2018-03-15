import java.util.*;
public class reverseParenthesis{
	public static void main(String[] args){
		String a = "abc(cba)ab(bac)c";
		int l = a.length();
		String res = "";
		for(int i=0; i<l; i++){
			char u = a.charAt(i);
			if(u!='('){
				res = res+Character.toString(u);
			}
			else{
				int k = a.lastIndexOf(')');
				String q = a.substring(i+1, k);
				res = res+getReverse(q);
				i=k;
			}
		}
		System.out.println(res);
	}
	public static String getReverse(String x){
		String z="";
		for(int i=0; i<x.length();i++){
			char q = x.charAt(i);
			if(q!='('&&q!=')'){
				z=Character.toString(q)+z;
			}
			else{
				int w = x.indexOf(')');
				String f = x.substring(i+1, w);
				z=f+z;
				i=w;
			}
		}
		return z;
	}
}
