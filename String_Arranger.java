import java.util.*;
import java.io.*;
class String_Arranger{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String to arrange alphabetically");
		String ax = in.nextLine();
		int b=1;
		String a = ax.substring(0, ax.length()-1);
		for(int i=0; i<a.length(); i++){
			if(a.charAt(i)==' ')
				b++;
		}
		String[] c = new String[b];
		int j=0;
		for(String retval:a.split(" ")){
			c[j] = retval;
			j++;
		}
		Arrays.sort(c);
		String fin="";
		for(int i=0; i<b-1; i++){
			fin = fin+c[i]+" ";
		}
		fin = fin+c[b-1];
		System.out.println(fin);
	}
}

