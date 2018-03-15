import java.util.*;
public class sortByHeight{
	public static void main(String[] args){
		int[] a = {-1, 156, 171, -1, 123, 100};
		int x = a.length;
		int l=0;
		for(int i=0; i<x; i++){
			if(a[i]!=-1)
				l++;
		}
		int[] index=new int[l];
		int[] elements=new int[l];
		l=0;
		for(int i=0; i<x; i++){
			if(a[i]!=-1){
				index[l]=i;
				elements[l]=a[i];
				l++;
			}
		}
		Arrays.sort(elements);
		for(int i=0; i<l; i++){
			a[index[i]]=elements[i];
		}
		for(int i=0; i<a.length; i++)
			System.out.print(a[i]+"  ");
	}
}
			
