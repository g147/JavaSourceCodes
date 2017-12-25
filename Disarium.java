import java.util.*;
public class Disarium
{

    /**
     * 
     */
    static public void main(String[] args)
    {;
        Scanner in =  new  Scanner(System.in);
        int n = in.nextInt();
        int c = 1;
        int rev;
        int sum;
        int x;
        x = n;
        sum = 0;
        rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        while (rev > 0) {
            sum = sum + (int)Math.pow(rev % 10, c);
            c = c + 1;
            rev = rev / 10;
        }
        if (sum == x) {
            System.out.println("Disarium Number");
        }
        else {
            System.out.println("Not a Disarium Number");
        }
    }
}
