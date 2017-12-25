import java.util.*;
public class combination{
    int n;
    int k;
    void Combination(){
        //to initialize the data members n = 0 and k = 0
        n=0;
        k=0;
    }
    void read(){
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        k = in.nextInt();
    }
    int fact(int l){
        if(l==1)
            return 1;
        return l*fact(l-1);
    }
    void compute(){
        int result=0;
        result = fact(n)/(fact(k)*fact(n-k));
        System.out.println(result);
    }
    public static void main(String[] args){
        combination a = new combination();
        a.Combination();
        a.read();
        a.compute();
    }
    
}