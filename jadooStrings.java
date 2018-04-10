import java.util.*;
import java.io.*;
public class jadooStrings{
public static void main(String[] args){
Scanner in = new Scanner(System.in);
String x = in.next();
String r="";
for(int i=x.length()-1; i>=0; i--){
r = r + Character.toString(x.charAt(i));
}
System.out.println(x.reverse());
}
}
