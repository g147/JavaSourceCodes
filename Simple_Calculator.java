import java.util.*;
public class Simple_Calculator
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Calcualtor Intitated.....");
        System.out.println("Enter 1 for Addition");
        System.out.println("Enter 2 for Substraction");
        System.out.println("Enter 3 for Multiplication");
        System.out.println("Enter 4 for Division");
        int n=in.nextInt();
        switch(n)
        {
            case 1:
            {
                System.out.println("Enter the two numbers to add");
                double n1=in.nextDouble();
                double n2=in.nextDouble();
                double n3=n1+n2;
                System.out.println("The Result of the Addition of "+n1+" & "+n2+" is "+n3);
            }
            break;
            case 2:
            {
                System.out.println("Enter the two numbers to subtract");
                double n1=in.nextDouble();
                double n2=in.nextDouble();
                double n3=n1-n2;
                System.out.println("The Result of the Substraction of "+n1+" & "+n2+" is "+n3);
            }
            break;
            case 3:
            {
                System.out.println("Enter the two numbers to multiply");
                double n1=in.nextDouble();
                double n2=in.nextDouble();
                double n3=n1*n2;
                System.out.println("The Result of the Multiplication of "+n1+" & "+n2+" is "+n3);
            }
            break;
            case 4:
            {
                System.out.println("Enter the two numbers to divide");
                double n1=in.nextDouble();
                double n2=in.nextDouble();
                double n3=n1/n2;
                System.out.println("The Result of the Division of "+n1+" & "+n2+" is "+n3);
            }
            break;
            default:
            {
                System.out.println ("Wrong Choice!!!!!");
                System.out.println ("Read the Instructions Carefully....");
            }
        }
    }
}