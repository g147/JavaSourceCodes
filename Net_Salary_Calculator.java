public class Net_Salary_Calculator
{
    public static void main(double basic_salary)
    {
        double da=0;
        double hra=0;
        double pf=0;
        da=0.75*basic_salary;
        if(basic_salary+da<30000)
        {
            hra=2000;
        }
        if(basic_salary+da>=30000&&basic_salary+da<40000)
        {
            hra=3000;
        }
        if(basic_salary+da>=40000)
        {
            hra=4000;
        }
        pf=0.14*(basic_salary+da);
        double net_salary=(basic_salary+da+hra)-pf;
        System.out.println("The Net Salary is Rs. "+net_salary);
    }
}
