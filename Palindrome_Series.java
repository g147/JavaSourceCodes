public class Palindrome_Series
{
    public static void main()
    {
        for(int n=1; n<=100; n++)
        {
            int reverse=0;
            int num=n;
            while(num>0)
            {
                int rem=n%10;
                reverse=10*reverse+rem;
                num=num/10;
            }
            if(reverse==n)
            System.out.println(n);
        }
    }
}