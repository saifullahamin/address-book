package payrollsystem;

public class BasePlusComissionEmployee extends ComissionedEmployee
{
    private double baseSalary;
    
    /**
    public BasePlusComissionEmployee(String FN, String LN, String SSN, double GS, double CR, double BS)
    {
        super(FN,LN,SSN,GS,CR);
        baseSalary = BS;
    }**/
    
    public void setBSalary(double BS)
    {
        baseSalary = BS;
    }
    public double getBSalary()
    {
        return baseSalary;
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
        double gSales = input.nextDouble();
        setGSales(gSales);
        
        System.out.print("Comission Rate (%) : ");
        double cRate = input.nextDouble();
        setCRate(cRate);
        
        System.out.print("Base Salary : ");
        baseSalary = input.nextDouble();
        
    }
    public double Earning()
    {
        return super.Earning() + baseSalary;
    }
}
