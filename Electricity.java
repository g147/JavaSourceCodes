public class Electricity
{
    public static void main(int units_consumed)

    {
        double bill=0;
        if(units_consumed<=100)
        {
            bill=250;
        }
        if(units_consumed>100&&units_consumed<=200)
        {
            bill=(2.5*units_consumed)+(((units_consumed-100)*2.5)*0.2);
        }
        if(units_consumed>200&&units_consumed<=300)
        {
            bill=(2.5*units_consumed)+(((units_consumed-200)*2.5)*0.25);

        }
        if(units_consumed>300)
        {
            bill=(2.5*units_consumed)+(((units_consumed-300)*2.5)*0.3);
        }
        System.out.println("The Total Electricity Bill on "+units_consumed+" units is Rs. "+bill);
    }
}
