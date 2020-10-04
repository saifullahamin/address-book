package payrollsystem;
import java.util.Scanner;
public class ComissionedEmployee extends Employee
{
    private double grossSales;
    private double commRate;
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    /**
    public ComissionedEmployee(String FN, String LN, String SSN, double GS, double CR)
    {
        super(FN,LN,SSN);
        grossSales = GS;
        commRate = CR;
    }
    * */
    
    public void setGSales(double GS)
    {
        grossSales = GS;
    }
    public void setCRate(double CR)
    {
        commRate = CR;
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
        
        System.out.print("\nGross Sales : ");
        grossSales = input.nextDouble();
        
        System.out.print("Comission Rate (%) : ");
        commRate = input.nextDouble();
    }
    
    public double getGSales()
    {
        return grossSales;
    }
    public double getCRate()
    {
        return commRate;
    }
    public double Earning()
    {
        return grossSales/commRate;
    }
}
