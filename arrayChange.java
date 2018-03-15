public class arrayChange{
	public static void main(String[] args){
		int[] a = {1,1,1};
		int r = 0;
		while(checkStrict(a)==false){
			int q = checkIndex(a);
			while(checkIndex(a)==q){
				a[q]=a[q]+1;
				r=r+1;
			}
		}
		System.out.println(r);
		for(int i=0; i<a.length; i++)
			System.out.print(a[i]+"  ");
	}
	public static boolean checkStrict(int[] a){
		boolean res = true;
		for(int i=0; i<a.length-1; i++){
			if(a[i]>=a[i+1]){
				res = false;
				break;
			}
		}
		return res;
	}
	public static int checkIndex(int[] a){
		int res = -1;
		for(int i=0; i<a.length-1; i++){
			if(a[i]>=a[i+1]){
				res = i+1;
				break;
			}
		}
		return res;
	}
}
