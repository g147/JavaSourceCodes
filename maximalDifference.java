public class maximalDifference{
	public static void main(String[] args){
		int[] a = {2,4,1,0};
		int max=0;
		for(int i=0; i<a.length-1; i++){
			int u = Math.abs(a[i]-a[i+1]);
			if(u>max)
				max=u;
		}
		System.out.println(max);
	}
}
