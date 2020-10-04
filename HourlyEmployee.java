package payrollsystem;
import java.util.Scanner;

public class HourlyEmployee extends Employee
{
    private double wage;
    private double hours;
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    /**
    public HourlyEmployee(String FN, String LN, String SSN, double W, double H)
    {
        super(FN,LN,SSN);
        wage = W;
        hours = H;
    }**/
    
    public void setWage(double W)
    {
        wage = W;
    }
    public void setHours(double H)
    {
        hours = H;
    }
    public void setData()
    {
        System.out.print("First Name : ");
        String FN = input.next();
        setFName(FN);
        
        System.out.print("Last Name : ");
        String LN = input.next();
        setLName(LN);
        
        System.out.print("SSN : ");
        String SSN = input.next();
        setSSN(SSN);
        
        System.out.print("\nWage : ");
        wage = input.nextDouble();
        
        System.out.print("Hours : ");
        hours = input.nextDouble();
        
    }
    
    public double getWage()
    {
        return wage;
    }
    public double getHours()
    {
        return hours;
    }
    public double Earning()
    {
        if(hours<=40)
        {
            return wage*hours;
        }
        else
        {
            return (wage+wage/10)*hours;
        }
    }
}
