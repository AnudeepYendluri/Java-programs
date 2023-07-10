 /*Write a program that takes an integer input from the user and prints "Positive" if the number is greater than zero, "Negative" if the number is less than zero, and "Zero" if the number is equal to zero.*/
import java.util.Scanner;
class PositiveNeg
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number");
      int num=sc.nextInt();

      if (num>0)
      {
        System.out.println("The given number is positive");
      }
      else if (num<0)
        {
         System.out.println("The given number is Negative");
        }
      else
      {
         System.out.println("The given number is zero");
      }
    }
  }