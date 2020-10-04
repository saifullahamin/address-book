package payrollsystem;

abstract public class Employee 
{
    private String FName;
    private String LName;
    private String SSN;
    
    /**
    public Employee(String FN, String LN, String SSN)
    {
        FName = FN;
        LName = LN;
        this.SSN = SSN;
    }**/
    
    public void setFName(String FN)
    {
        FName = FN;
    }
    public void setLName(String LN)
    {
        LName = LN;
    }
    public void setSSN(String SSN)
    {
        this.SSN = SSN;
    }
    public String getFName()
    {
        return FName;
    }
    public String getLName()
    {
        return LName;
    }
    public String getSSN()
    {
        return SSN;
    }
    public String toString()
    {
        return FName+" "+LName;
    }
    abstract public double Earning();
}
