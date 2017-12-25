import java.util.*;
class CircularPrime{
    
    static boolean isPrime(int n){
        
        boolean result=true;
         // Corner cases
        if(n<=1)
            result = false;
        if(n<=3)
            result = true;
        // This is checked so that we can skip
        // middle five numbers in below loop
        if(n%2==0 || n%3==0)
            result = false;
        for(int i=5;(i*i)<=n;i=i+6)
            if(n%i==0||n%(i+2)==0)
                result=true;
        return result;
    }
    
    static boolean checkCircularPrime(int N){
        int count = 0;
        int temp = N;
        while(temp>0){
            count++;
            temp/=10;
        }
        
        int num = N;
        while(isPrime(num)){
            int rem = num%10;
            int div = num/10;
            num = (int)(Math.pow(10, count-1)*rem)+div;
            System.out.println(num);
            if(num==N)
            return true;
        }
        return false;
        
    }
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(checkCircularPrime(n));
    }
}