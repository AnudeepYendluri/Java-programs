/*WAP to input electricity unit charges and calculate total     electricity bill according to the given condition:
    For first 50 units Rs. 0.50/unit
    For next 100 units Rs. 0.75/unit
    For next 100 units Rs. 1.20/unit
     For unit above 250 Rs. 1.50/unit
     An additional surcharge of 20% is added to the bill*/
import java.util.Scanner;
class ElectricityBill
  {
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);

     System.out.println("enter the no of units");
     double units = sc.nextDouble();

      if(units<=50)
      {
        double bill=(units*0.5);
        System.out.println(bill);
        
        
        double ad_ch= (bill*20)/100;
        double total_bill = (bill+ad_ch);
        System.out.println("total bill is "+total_bill);
      
        
      }
      else if (units>50 && units <=150)
      {
        double bill= ((50*0.50)+((units-50)*0.75));
        System.out.println(bill);
        
        
        double ad_ch= (bill*20)/100;
        double total_bill = (bill+ad_ch);
        System.out.println("total bill is "+total_bill);
      

      }
      else if (units>150 && units <=250)
      {
        double b=((units-50)-100);
        double c=((units-50)-b);
        double bill= ((50*0.50)+(b*0.12)+(c*0.75));
        System.out.println(bill);
        
        
        double ad_ch= (bill*20)/100;
        double total_bill = (bill+ad_ch);
        System.out.println("total bill is "+total_bill);
      
      }
      else
      {
       double d=((units-50)-200);
       double c=((units-150)-d);
       double b=((units-150)-d); 
       double bill=((50*0.50)+(d*1.50)+(c*0.75)+(b*1.20));
       System.out.println(bill);
       
        
       double ad_ch= (bill*20)/100;
       double total_bill = (bill+ad_ch);
       System.out.println("total bill is "+total_bill);
      
      }
      
      
    }
  }
  

