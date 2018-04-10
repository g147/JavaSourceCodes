import java.util.*;
public class avoidObstacles{
	public static void main(String[] args){
		int [] a = {5,3,6,7,9};
		Arrays.sort(a);
		int min=a[0]+1;;
		for(int i=0; i<a.length; i++){
			if(min!=a[i]){
				if(a[i]%min==0){
					min++;
					i=0;
					continue;
				}
			}
			else{	
				min++;
				i=0;
				continue;
			}
		}
		System.out.println(min);
	}
}
			
