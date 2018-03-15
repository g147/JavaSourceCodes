import java.util.*;
public class areSimmilar{
	public static void main(String[] args){
		int[] a = {1,2,2};
		int[] b = {1,2,1};
		boolean r = checkEquality(a,b);
		if(r==false){
			for(int i=0; i<b.length; i++){
				b=swap(b,i);
				r = checkEquality(a,b);
				if(r==true)
					break;
			}
		}
		System.out.println(r);
	}
	public static boolean checkEquality(int[] x, int[] y){
		boolean res = false;
		if(x.length!=y.length)
			return false;
		else {
			for(int i=0; i<x.length; i++){
				if(x[i]==y[i])
					res=true;
				else{
					res=false;
					break;
				}
			}
		}
		return res;
	}
	public static int[] swap(int[] x, int y){
		int sw;
		if(y!=x.length-1){
			sw = x[y];
			x[y]=x[y+1];
			x[y+1]=sw;
		}
		else{
			sw = x[y];
			x[y]=x[0];
			x[0]=sw;
		}
		return x;
	}
}
			
		
