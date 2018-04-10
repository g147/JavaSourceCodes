import java.util.Scanner;
public class stringOperations{
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        String s =in.next();
        String l = "";
        int Q = in.nextInt();
        for(int i=1; i<=Q; i++){
            int ind = in.nextInt();
            String ch = in.next();
            s = s.substring(0, ind-1)+ch+s.substring(ind);
            l=s;
        }
        System.out.println(s);
        int M = in.nextInt();
        for(int i=1; i<=M; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            a=a-1;
            b=b-1;
            String t = s.substring(0, a);
            for(int j=b; j>=a; j--){
                t = t+Character.toString(s.charAt(j));
            }
            t=t+s.substring(b+1);
            s=t;
        }
        System.out.println(s);
        int k=0;
        for(int i=0; i<s.length(); i++){
            if(l.charAt(i)==s.charAt(i))
                k=k+1;
        }
        System.out.println(k);
    }
}