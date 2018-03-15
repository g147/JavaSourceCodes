import java.util.*;
import java.io.*;
public class lucky{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = in.nextInt();
		int l = countDigits(a);
		if(l%2==0){
			int x = getSum(getFirstPart(a, l/2));
			int y = getSum(getSecondPart(a, l/2));
			
			if(x==y)
				System.out.println("true");
			else
				System.out.println("false");
		}
		else
			System.out.println("false");
	}
	public static int countDigits(int q){
		String l = Integer.toString(q);
		return l.length();
	}
	public static int getFirstPart(int q, int w){
		String l = Integer.toString(q);
		String p = l.substring(0,w);
		return Integer.parseInt(p);
	}
	public static int getSecondPart(int q, int w){
		String l = Integer.toString(q);
		String p = l.substring(w);
		return Integer.parseInt(p);
	}
	public static int getSum(int q){
		int sum = 0;
		String w = Integer.toString(q);
		for(int i=0; i<w.length(); i++){
			sum = sum + Integer.parseInt(Character.toString(w.charAt(i)));
		}
		return sum;
	}
}
