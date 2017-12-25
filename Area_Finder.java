import java.io.*;
class Area_Finder
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader Br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Area of:");
        System.out.println("1.Triangle:");
        System.out.println("2.Circle:");
        System.out.println("3.Rectangle:");
        System.out.println("4.Square:");
        System.out.println("5.Cylinder:");
        int m=Integer.parseInt(Br.readLine());
        switch(m)
        {
            case 1:
            System.out.println("Enter the hieght and base:");
            double h=Double.parseDouble(Br.readLine());
            double b=Double.parseDouble(Br.readLine());
            double ar=(1/2)*b*h;
            System.out.println("Base:"+b);
            System.out.println("Hieght:"+h);
            System.out.println("Area:"+ar);
            break;
            case 2:
            System.out.println("Enter radius:");
            double r=Double.parseDouble(Br.readLine());
            double arr=3.14*(r*r);
            System.out.println("Radius:"+r);
            System.out.println("Area:"+arr);
            break;
            case 3:
            System.out.println("Enter the length and breadth:");
            double l=Double.parseDouble(Br.readLine());
            double base=Double.parseDouble(Br.readLine());
            double are=l*base;
            System.out.println("Breadth:"+base);
            System.out.println("Length:"+l);
            System.out.println("Area:"+are);
            break;
            case 4:
            System.out.println("Enter the side:");
            double a=Double.parseDouble(Br.readLine());
            double ara=a*a;
            System.out.println("Side:"+a);
            System.out.println("Area:"+ara);
            break;
            case 5:
            System.out.println("Enter radius and hieght:");
            double rad=Double.parseDouble(Br.readLine());
            double hie=Double.parseDouble(Br.readLine());
            double ara1=3.14*(rad*rad)*hie;
            System.out.println("Radius:"+rad);
            System.out.println("Hiegth:"+hie);
            System.out.println("Area:"+ara1);
            break;
            default:
            System.out.println("Wrong Choice:");
        }
    }
}
