class GCD{
    public static int rec(int n, int m){
        if (m==0){
            return 0;
        }
        else{
            return rec(m,m%n);
        }
    }
    public static void main(String[] args){
        System.out.println(rec(1440, 1408));
    }
}