public class Fibonacci_Series
{
    public static void main(String[]args)
{}
    void main(int maximum_series)
    {
        int t1=0;
        int t2=1;
        System.out.print(t1+", "+t2+", ");
        for(int i=3; i<=maximum_series; i++)
        {
            int t3=t1+t2;
            System.out.print(t3+", ");
            t1=t2;
            t2=t3;
        }
    }
}
