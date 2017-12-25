import java.util.*;
class Array_Alter_Sort{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Integer");
		int n = in.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the numbers");
		for(int i=0; i<n; i++){
			a[i] = in.nextInt();
		}
		Arrays.sort(a);
		int[] b = new int[n];
		int k=n-1;
		int f=n-1;
		for(int i=0; i<=n/2; i=i++){
			b[f-k] = a[i+2];
			k--;
		}
		for(int i=0; i<n; i++){
			System.out.println(b[i]);
		}
	}
}

