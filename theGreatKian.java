import java.util.*;
public class theGreatKian{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int l = in.nextInt();
		long[] a = new long[l];
		for(int i=0; i<l; i++){
			a[i] = in.nextLong();
		}
		long[] k = new long[3];
		k[0]=0;
		k[1]=0;
		k[2]=0;
		for(int i=0; i<l; i=i+3){
			k[0]=k[0]+a[i];
		}
		for(int i=1; i<l; i=i+3){
			k[1]=k[1]+a[i];
		}
		for(int i=2; i<l; i=i+3){
			k[2]=k[2]+a[i];
		}
		System.out.println(k[0]+" "+k[1]+" "+k[2]);
	}
}
