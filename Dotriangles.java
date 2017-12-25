import java.util.*;
public class Dotriangles{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int dots = 0;
        for(int i=1; i<=x; i++)
            dots=dots+i;
        System.out.println(dots);
    }
}