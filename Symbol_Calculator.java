import java.io.*;
class Symbol_Calculator

{
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter two numbers: ");
        double n=Double.parseDouble(br.readLine());
        double m=Double.parseDouble(br.readLine());
        double d=0.0;
        System.out.println("Enter the choice: ");
        System.out.println("1. + for ADDITION ");
        System.out.println("2. - for SUBTRACTION ");
        System.out.println("3. * for MULTIPLICATION ");
        System.out.println("4. / for DIVISION ");
        System.out.println("5. % for MODULOUS ");
        char b=(char)(br.read());           
        switch(b)
        {
            case '+':
            d=n+m;
            System.out.println("SUM: "+d);
            break;
            case '-':
            d=n-m;
            System.out.println("DIFFERENCE: "+d);
            break;
            case '*':
            d=n*m;
            System.out.println("PRODUCT: "+d);
            break;
            case '/':
            d=n/m;
            System.out.println("QOUTIENT: "+d);
            break;
            case '%':
            d=n%m;
            System.out.println("REMAINDER: "+d);
            break;
            default:
            System.out.println("INVALID CHOICE");
        }
    }
}