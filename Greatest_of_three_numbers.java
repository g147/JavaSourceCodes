public class Greatest_of_three_numbers
{
    public static void main(int n1, int n2, int n3)
    {
        if(n1>n2)
        {
            if(n1>n3)
            {
                System.out.println("The Greatest Number is "+n1);
            }
            else
            {
                System.out.println("The Greatest Number is "+n3);
            }
        }
        else
        {
            if(n2>n3)
            {
                System.out.println("The Greatest Number is "+n2);
            }
            else
            {
                System.out.println("The Greatest Number is "+n3);
            }
        }
    }
}