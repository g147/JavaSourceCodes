import java.util.*;
class MyArray{
    Scanner in = new static Scanner(System.in);
    int n = in.nextInt();
    int[] arr = new int[n];
    void myArray(){
        for(int i=0; i<n; i++)
            arr[i]=0;
    }
    void readArray(){
        for(int i=0; i<n; i++)
            arr[i] = in.nextInt();
    }
    void displayArray(){
        for(int i=0; i<n; i++)
            System.out.println(arr[i]);
    }
    int binarySearch(int k){
        int l=0;
        int r = arr.length-1;
        while(l<=r){
            int mid = (l-((r-l)/2));
            if(arr[mid]==k)
                return mid;
            else if(arr[mid]>k)
                r=mid-1;
            else
                l=mid-1;
        }
            return -999;
    }
    
    public static void main(String[] args){
        int f = in.nextInt();
        MyArray a = new MyArray();
        a.myArray();
        a.readArray();
        a.displayArray();
        System.out.println(a.binarySearch(f));
    }
}