public class addBorder{
	public static void main(String[] args){
		String[] p = {"abcd", "defg"};
		int l = p.length;
		int u = p[0].length();
		String[] r = new String[l+2];
		
		for(int i=0; i<r.length; i++)
			r[i]="";
		
		for(int i=0; i<r.length; i++){
			for(int j=0; j<u+2; j++){
				r[i] = r[i]+"*";
			}
		}
		int f=0;
		for(int i=1; i<r.length-1; i++){
			r[i]="*"+p[f]+"*";
			f++;
		}
		
		for(int i=0; i<r.length; i++)
			System.out.println(r[i]);
			
	}
}
