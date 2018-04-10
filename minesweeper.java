public class minesweeper{
	public static void main(String[] args){
		boolean[][] a = {{true, false, false},
						 {false, true, false},
						 {false, false, false}};
		int[][] r = new int[a.length][a[0].length];
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length; j++){
				r[i][j] = getMines(a, i, j);
			}
		}
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length; j++){
				System.out.print(r[i][j]+"  ");
			}
			System.out.println();
		}
	}
	public static int getMines(boolean[][] a, int r, int c){
		int m=0;
		if(r==0){
			if(c==0){
				if(a[r][c+1]==true)
					m=m+1;
				if(a[r+1][c]==true)
					m=m+1;
				if(a[r+1][c+1]==true)
					m=m+1;
				return m;
			}
			else if(c==a[0].length-1){
				if(a[r][c-1]==true)
					m=m+1;
				if(a[r+1][c]==true)
					m=m+1;
				if(a[r+1][c-1]==true)
					m=m+1;
				return m;
			}
			else{
				if(a[r][c+1]==true)
					m=m+1;
				if(a[r][c-1]==true)
					m=m+1;
				if(a[r+1][c+1]==true)
					m=m+1;
				if(a[r+1][c-1]==true)
					m=m+1;
				if(a[r+1][c]==true)
					m=m+1;
				return m;
			}
		}
		else if(r==a.length-1){
			if(c==0){
				if(a[r][c+1]==true)
					m=m+1;
				if(a[r-1][c]==true)
					m=m+1;
				if(a[r-1][c+1]==true)
					m=m+1;
				return m;
			}
			else if(c==a[0].length-1){
				if(a[r][c-1]==true)
					m=m+1;
				if(a[r-1][c]==true)
					m=m+1;
				if(a[r-1][c-1]==true)
					m=m+1;
				return m;
			}
			else{
				if(a[r][c+1]==true)
					m=m+1;
				if(a[r][c-1]==true)
					m=m+1;
				if(a[r-1][c+1]==true)
					m=m+1;
				if(a[r-1][c-1]==true)
					m=m+1;
				if(a[r-1][c]==true)
					m=m+1;
				return m;
			}
		}
		
		else{
			if(c==0){
				if(a[r][c+1]==true)
					m=m+1;
				if(a[r-1][c]==true)
					m=m+1;
				if(a[r-1][c+1]==true)
					m=m+1;
				if(a[r+1][c]==true)
					m=m+1;
				if(a[r+1][c+1]==true)
					m=m+1;
				return m;
			}
			else if(c==a[0].length-1){
				if(a[r][c-1]==true)
					m=m+1;
				if(a[r-1][c]==true)
					m=m+1;
				if(a[r-1][c-1]==true)
					m=m+1;
				if(a[r+1][c]==true)
					m=m+1;
				if(a[r+1][c-1]==true)
					m=m+1;
				return m;
			}
			else{
				if(a[r][c+1]==true)
					m=m+1;
				if(a[r][c-1]==true)
					m=m+1;
				if(a[r-1][c+1]==true)
					m=m+1;
				if(a[r-1][c-1]==true)
					m=m+1;
				if(a[r-1][c]==true)
					m=m+1;
				if(a[r+1][c+1]==true)
					m=m+1;
				if(a[r+1][c-1]==true)
					m=m+1;
				if(a[r+1][c]==true)
					m=m+1;
				return m;
			}
		}
	}
}
