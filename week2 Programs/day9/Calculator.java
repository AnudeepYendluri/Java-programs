/*8. Calculator App : create an application that takes a two values along with operator and find the value based on operator.*/
import java.util.Scanner;
class Calculator
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a num1 ");
      int num1=sc.nextInt();
      System.out.println("Enter a num2 ");
      int num2=sc.nextInt();
      System.out.println("Enter a character ");
      char ch=sc.next().charAt(0);

    if(ch=='+')
    {
      System.out.println((num1+num2) + " Addition");
    }
     else if(ch=='-')
    {
      System.out.println((num1-num2) + " Subtraction");
    }
      else if(ch=='*')
    {
      System.out.println((num1*num2) + " multiplication");
    }
      else if(ch=='/')
    {
      System.out.println((num1/num2) + " Division");
    }
      else if (ch=='%')
      {
        System.out.println((num1%num2) + " remainder");
      }
      else
      {
        System.out.println("invalid");
      }
    }
  }