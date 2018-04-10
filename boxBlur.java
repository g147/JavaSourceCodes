import java.util.*;
public class boxBlur{
	public static void main(String[] args){
		int[][] a = {{1,1,1},
					 {1,7,1},
					 {1,1,1}};
		int r = a.length;
		int c = a[0].length;
		int x = r*c;
		int u = getNum(a);
		
