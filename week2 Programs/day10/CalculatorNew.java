import java.util.Scanner;
class CalculatorNew
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a num1 ");
      int num1=sc.nextInt();
      
      System.out.println("Enter a num2 ");
      int num2=sc.nextInt();

      System.out.println("choose charecters from (+,-,*,%,/)");
      System.out.println("Enter a character ");
      char ch=sc.next().charAt(0);

      switch(ch)
        {
          case '+':
          System.out.println( (num1+num2)+" is Addition") ;
          break;
          case '-':
          System.out.println( (num1-num2)+" is Subtraction") ;
          break;  
          case '*':
          System.out.println( (num1*num2)+" is Multiplication") ;
          break;
          case '/':
          System.out.println( (num1/num2)+" is division") ;
          break;
          case '%':
          System.out.println( (num1%num2)+" is Addition") ;
          break;  
          default :
          System.out.println("invalid") ;
        }
    }
  }
