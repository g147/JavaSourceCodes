import java.util.*;
public class createCar{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int length = in.nextInt();
		int doors = in.nextInt();
		firstLayer(length-2);
		secondLayer(length-1, doors);
		thirdLayer(length);
	}
	public static void firstLayer(int l){
		System.out.print(" ");
		for(int i=1;i<l;i++)
			System.out.print("_");
		System.out.println();
	}
	public static void secondLayer(int l, int d){
		System.out.print("|");
		int b = d/2;
		int f = d-b;
		while(b>0){
				System.out.print("[]");
				b--;
		}
		for(int i=1; i<l-1-(2*d); i++){
			System.out.print(" ");
		}
		while(f>0){
				System.out.print("[]");
				f--;
		}
		System.out.print("\\");
		System.out.println();
		
	}
	public static void thirdLayer(int l){
		System.out.print("-");
		int w=2;
		if(l>=12)
			w=w+(l-10)/2;
		int f = w/2;
		int b = w-f;
		while(b>0){
			System.out.print("o-");
			b--;
		}
		for(int i=1; i<l-1-(2*w); i++){
			System.out.print("-");
		}
		while(f>0){
			System.out.print("o-");
			f--;
		}
		System.out.print("'");
	}
}
 /*
  *     ____
  *    |  []\
  *    -o--o-'
  *  
  * 
  * 
  * 
  */
