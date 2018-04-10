import java.io.*;
import java.util.*;
public class swappingLetters{
	public static void main(String[] args){
		String x = "Once upon a[e<->r] timr threr [a<->l]wls l alnd whrer King Labret euard.";
		int l = x.length();
		int q=0;
		for(int i=0; i<l; i++){
			if(x.charAt(i)=='[')
				q++;
		}
		char[][] r = new char[2][3];
		for(int i=0; i<l; i++){
			char a = x.charAt(i);
			int j=0;
			if(a=='<'){
				r[j][0] =  x.charAt(i-1);
			}
			if(a=='>'){
				r[j][1] =  x.charAt(i+1);
				r[j][2] =  (char)(i+1);
				j++;
			}
		}
		for(int i=0; i<2; i++){
			System.out.println(r[i][0]+"  "+r[i][2]+"  "+r[i][2]);
		}
		String res="";
		for(int i=0; i<q; i++){
			for(int j=0; j<l; j++){
				char a = x.charAt(j);
				if(a==r[i][1]&&j>(int)r[i][2])
					res = res+Character.toString(r[i][0]);
				else 
					res = res+Character.toString(a);
			}
		}
		System.out.println(res);
	}
}
		
