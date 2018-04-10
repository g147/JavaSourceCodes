import java.util.*;
public class theDawn{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		long x = in.nextLong();
		long sum=(x/2)+2;
		for(long i=2; i<=x; i++){
			if(x%i==0){
				long d = x/i;
				if(i+d<sum)
					sum=i+d;
			}
		}
		System.out.println(sum);
	}
}
