import java.util.*;
class twinPrime{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the positive integer :");
		int n  = in.nextInt();
		int p1 = 0;
		int p2 = 0;
		int k1 = 0;
		int k2 = 0;
		int d  = 0;
		int d1 = 10;
		for(int i=2;i<100 ; i++){
			if(checkPrime(i)==true&&checkPrime(i+2)==true){
				p1=i;
				p2=i+2;
			}
			d = Math. min((Math.abs(n-p1)),Math.abs(n-p2));
			if(d<d1){
				d1=d;
				k1=p1;
				k2=p2;
			}
		}
		System.out.println(k1+" , "+k2);
	}
	public static  boolean checkPrime(int k){
		int c = 0;
		for(int i=2; i<k; i++){
			if(k%i==0)
				c++;
		}
		if(c==0)
			return true;
		return false;
	}
}

