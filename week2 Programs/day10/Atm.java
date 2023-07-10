import java.util.Scanner;
class Atm
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      
    int balance = 30000;
    int pin = 2345;
      
    System.out.println("choose charecter from \n (1 for Deposit,2 for withdrawl,3 for balance enquiry,4 for check pin)");
    System.out.println("enter the character");
    char ch=sc.next().charAt(0);

    

    switch(ch)
      {
        case '1':
        System.out.println("Deposit");
        System.out.println("enter the amount");
        int amount = sc.nextInt();
        int deposit= (balance+amount);
        System.out.println(deposit);
        break;
          
        case '2':
        System.out.println("withdrawl");
        System.out.println("enter the amount");
        int amt = sc.nextInt();
          if(amt<balance)
        {
          int withdraw = amt;
          System.out.println("withdraw sucessful"+ amt);
          int newbal = (balance-amt);
          System.out.println(newbal +" balance amt after withdrawl");
        }
          else
        {
          System.out.print("insufficent amount");
        }
        
        break;

          
        case '3':
        System.out.println("balance enquiry");
        int bal_enq=balance;
        System.out.println("balance amount is "+ bal_enq);
         break;
        case '4':
        System.out.println("check pin");
        System.out.println("Enter the 4 digit pin");
        int pin_x=sc.nextInt();
        if (pin==pin_x)
        {
          System.out.println("pin is valid");
        }
          else
        {
          System.out.println("pin is invalid");
        }
        break;
        
        
        default:
          System.out.println("invalid");
          
      }
    }
  }

    
    
    
 