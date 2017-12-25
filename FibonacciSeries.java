class FibonacciSeries{
    public static int rec(int a){
        if(a==0||a==1)
            return a;
        else
            return rec(a-1)+rec(a+1);
    }
     public static void main(String[] args){
        System.out.println(rec(5));
     }
}