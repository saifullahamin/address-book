package payrollsystem;
import java.util.Scanner;

public class SalariedEmployee extends Employee
{
    private double weeklySal;
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    /**public SalariedEmployee(String FN, String LN, String SSN, double WS)
    {
        super(FN,LN,SSN);
        weeklySal = WS;
    }**/
    
    public void setWSalary(double WS)
    {
        weeklySal = WS;
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
        
        System.out.print("\nWeekly Salary : ");
        weeklySal = input.nextDouble();
    }
    
    public double getWSalary()
    {
        return weeklySal;
    }
    public double Earning()
    {
        return weeklySal*4;
    }

}
