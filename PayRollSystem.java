package payrollsystem;
import java.util.Scanner;

public class PayRollSystem 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        Employee[] employee_array = new Employee[4];
        
        System.out.println("\n--- Employee Pay Calculator ---\n\n");
            
        while(true)
        {
            System.out.println("(1) Salaried Employee\n(2) Comissioned Employee\n(3) Base Plus Comissioned Employee\n(4) Hourly Employee\n(0) Quit\n");
            System.out.print("Option : ");
            String option = input.next();
            
            if(option.equals("0"))
            {
                break;   
            }
            
            System.out.println();
            switch(option)
            {
                case "1":
                {
                    SalariedEmployee SE = new SalariedEmployee();
                    SE.setData();
                    
                    System.out.println("\n\n     --- Pay Roll ---");
                    System.out.println("\n----------------------------");
                    System.out.println("\n    Name : "+SE.toString());
                    System.out.println("\n    SSN : "+SE.getSSN());

                    employee_array[0] = SE;
                    System.out.println("\n    Earning : "+employee_array[0].Earning());
                    System.out.println("\n----------------------------\n");
                    
                    break;
                }
                case "2":
                {
                    ComissionedEmployee CE = new ComissionedEmployee();
                    CE.setData();
                    System.out.println("\n\n     --- Pay Roll ---");
                    System.out.println("\n----------------------------");
                    System.out.println("\n    Name : "+CE.toString());
                    System.out.println("\n    SSN : "+CE.getSSN());

                    employee_array[1] = CE;
                    System.out.println("\n    Earning : "+employee_array[1].Earning());
                    System.out.println("\n----------------------------\n");
                    
                    break;
                }
                case "3":
                {
                    BasePlusComissionEmployee BCE = new BasePlusComissionEmployee();
                    BCE.setData();
                    System.out.println("\n\n     --- Pay Roll ---");
                    System.out.println("\n----------------------------");
                    System.out.println("\n    Name : "+BCE.toString());
                    System.out.println("\n    SSN : "+BCE.getSSN());

                    employee_array[2] = BCE;
                    System.out.println("\n    Earning : "+employee_array[2].Earning());
                    System.out.println("\n----------------------------\n");
                    
                    break;
                }
                case "4":
                {
                    HourlyEmployee HE = new HourlyEmployee();
                    HE.setData();
                    System.out.println("\n\n     --- Pay Roll ---");
                    System.out.println("\n----------------------------");
                    System.out.println("\n    Name : "+HE.toString());
                    System.out.println("\n    SSN : "+HE.getSSN());

                    employee_array[3] = HE;
                    System.out.println("\n    Earning : "+employee_array[3].Earning());
                    System.out.println("\n----------------------------\n");
                   
                    break;
                }
                default:
                {
                    System.out.println("Wrong Entry !");
                }
            }
            System.out.println("\n");
        }
        System.out.println("\n\nThank you for using our software !\n\n");
    }
    
}
