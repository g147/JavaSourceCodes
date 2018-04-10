import java.util.Scanner;
public class stringAddition{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        for(int i=0; i<a; i++){
            String x = in.next();
            System.out.println(addR(x));
        }
        in.close();
    }
    public static String addR(String a) {
        StringBuffer b = new StringBuffer(a);
        String c = a;
        b.reverse();
        String r="";
        for(int i=0; i<a.length(); i++){
            char x = c.charAt(i);
            char y = b.charAt(i);
            if((x+y)<219)
                r = r+Character.toString((char)((x+y)-96));
            else
                r = r+Character.toString((char)((x+y)-122));
        }
        return r;
    }
}