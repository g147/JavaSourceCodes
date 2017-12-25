import java.util.*;
class Magic_Number{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        String k = Integer.toString(x);
        int l = k.length();
        int sum = 0;
        while(l>1){
            sum=0;
            for(int i=0; i<l; i++){
                char t = k.charAt(i);
                int f = Integer.parseInt(Character.toString(t));
                sum = sum+f;
            }
            System.out.println(sum);
            k = Integer.toString(sum);
            l = k.length();
        }   
    }
}