import java.util.*;
public class ConsChange{
    String word;
    int ten;
    static Scanner in = new Scanner(System.in);
    
    ConsChange(){
        word="";
        ten=word.length();
    }
    
    public void readword(){
        System.out.println("Enter the word");
        word = in.nextLine();
        ten = word.length();
    }
    
    public void shiftCons(){
        String k="";
        String l="";
        for(int i=0; i<ten; i++){
            if(word.charAt(i)!='a'&&word.charAt(i)!='e'&&word.charAt(i)!='i'&&word.charAt(i)!='o'&&word.charAt(i)!='u'){
                k = k+Character.toString(Character.toUpperCase(word.charAt(i)));
            }
            else
                l = l+Character.toString(word.charAt(i));
        }
        word = k+l;
        System.out.println(word);
    }
    
    public static void main(String[] args){
        ConsChange obj = new ConsChange();
        obj.readword();
        obj.shiftCons();
    }
}