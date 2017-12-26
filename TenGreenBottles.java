import java.util.*;
public class TenGreenBottles{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        String[] k = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};
        for(int i=x; i>0; i--){
            System.out.println();
            System.out.println();
            System.out.println(k[i]+" Green Bottles hanging on the wall,");
            System.out.println(k[i]+" Green Bottles hanging on the wall,");
            System.out.println("And if one green bottle should accidentaly fall,");
            System.out.println("There'll be "+k[i-1]+" Green Bottles hanging on the wall.");
        }	
    }
}
