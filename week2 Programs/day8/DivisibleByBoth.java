/*WAP to check whether a number is divisible by 5 and 11 or not.*/
import java.util.Scanner;
class DivisibleByBoth
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number ");
      int number = sc.nextInt();

      if(number%5==0 && number%11==0)
      {
        System.out.println("The given number is divisible by 5 and 11");
      }
      else
      {
        System.out.println("The given number is not divisible by 5 and 11 ");
      }
      
    }
  }