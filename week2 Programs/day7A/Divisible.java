/*  Write a program that takes two input numbers from the user and prints whether the first number is divisible by the second number.*/
import java.util.Scanner;
  class Divisible
  {
    public static void main(String args[])
    {
     Scanner scan=new Scanner(System.in);

      System.out.println("enter first num1");
      int num1=scan.nextInt();

      System.out.println("enter first num2");
      int num2=scan.nextInt();
      

      if(num1%num2==0)
      {
        System.out.println("the given numbers are divisible");
      }
      else{
        System.out.println("the given numbers are not divisible");
        
      }
      
    }
  }