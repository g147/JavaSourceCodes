public class alternatingSums{
	public static void main(String[] args){
		int[] a = {50, 60, 60, 45, 70};
		int[] r = new int[2];
		for(int i=0; i<a.length; i=i+2){
			r[0]=r[0]+a[i];
		}
		for(int i=1; i<a.length; i=i+2){
			r[1]=r[1]+a[i];
		}
		System.out.println(r[0]+"   "+r[1]);
	}
}
