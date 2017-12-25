import java.util.*;
public class Number_of_notes_for_given_amount
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the amount");
        int n=in.nextInt();
        int two_thousand = n/2000;
        n=n-(two_thousand*2000);
        int five_hundred = n/500;
        n=n-(five_hundred*500);
        int one_hundred = n/100;
        n=n-(one_hundred*100);
        int fifty = n/50;
        n=n-(fifty*50);
        int twenty = n/20;
        n=(n-(twenty*20));
        int ten = n/10;
        n=(n-(ten*10));
        int five = n/5;
        n=(n-(five*5));
        int two = n/2;
        if(two_thousand>0)
            System.out.println("Two Thousand Notes : "+two_thousand);
        if(five_hundred>0)
            System.out.println("Five Hundred Notes : "+five_hundred);
        if(one_hundred>0)
            System.out.println("One Hundred Notes : "+one_hundred);
        if(fifty>0)
            System.out.println("Fifty Notes : "+fifty);
        if(twenty>0)
            System.out.println("Twenty Notes : "+twenty);
        if(ten>0)
            System.out.println("Ten Notes : "+ten);
        if(five>0)
            System.out.println("Five Notes : "+five);
        if(two>0)
            System.out.println("Two Notes : "+two);
    }
}
