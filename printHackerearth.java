public class printHackerearth {
    public static void main(String[] args) {
        int l =  13;
        String x = "aahkcreeatrha";
        int[] a = new int[26];
        a = giveArray(x);
        int count =0;
        while(l>0){
            if(
                a[(int)'h'-97]>=2&&
                a[(int)'a'-97]>=2&&
                a[(int)'c'-97]>=1&&
                a[(int)'k'-97]>=1&&
                a[(int)'e'-97]>=1&&
                a[(int)'r'-97]>=1&&
                a[(int)'t'-97]>=1
            ){
                count++;
                a[(int)'h'-97]-=2;
                a[(int)'a'-97]-=2;
                a[(int)'c'-97]-=1;
                a[(int)'k'-97]-=1;
                a[(int)'e'-97]-=1;
                a[(int)'r'-97]-=1;
                a[(int)'t'-97]-=1;
                l=l-9;
            }
            else{
                break;
            }
            System.out.println(count);
        }
    }
    public static int[] giveArray(String x){
		int[] y = new int[26];
		for(int i=0; i<y.length; i++)
			y[i]=0;
		for(int i=0; i<x.length(); i++){
			char u = x.charAt(i);
			int v = (int)u;
			y[v-97]=y[v-97]+1;
		}
		return y;
	}
}