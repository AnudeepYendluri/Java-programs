 /*   14. WAP to input basic salary of an employee and calculate its Gross     salary according to following:
    Basic Salary <= 10000 : HRA = 20%, DA = 80%
    Basic Salary <= 20000 : HRA = 25%, DA = 90%
    Basic Salary > 20000 : HRA = 30%, DA = 95%*/
import java.util.Scanner;
class Gross
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a basic salary");
      double basicpay = sc.nextDouble();
    
      
     
    if (basicpay <=10000)
    {
       double hra=((basicpay*20)/100);
       double da=((basicpay*80)/100);
      double gross_salary= basicpay+hra+da;
      System.out.println(gross_salary);
    }
     else if (basicpay <=20000)
    {
      double hra=((basicpay*25)/100);
      double da=((basicpay*90)/100);
      double gross_salary= basicpay+hra+da;
      System.out.println(gross_salary);
    }
      else 
    {
      double hra=((basicpay*30)/100);
      double da=((basicpay*95)/100);
      double gross_salary= basicpay+hra+da;
       System.out.println(gross_salary);
    }
      
      
    }
  }