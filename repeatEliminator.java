import java.util.*;
class repeatEliminator{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        int k = a.length();
        String fin = Character.toString(a.charAt(0));
        for(int i=0; i<k-1; i++){
            char x = a.charAt(i);
            char y = a.charAt(i+1);
            if(x==y)
                fin=fin+"";
            else
                fin = fin + Character.toString(y);
        }
        System.out.println(fin);
    }
}