/*Write a program that takes two integer inputs from the user and prints "Equal" if the two numbers are equal, and "Not Equal" if they are not equal.*/
import java.util.Scanner;
  class EqualOrNot
  {
    public static void main(String args[])
    {
     Scanner scan=new Scanner(System.in);

      System.out.println("enter first num1");
      int num1=scan.nextInt();

      System.out.println("enter first num2");
      int num2=scan.nextInt();
      

      if(num1==num2)
      {
        System.out.println("The two numbers are equal");
      }
      else{
        System.out.println("The two numbers are not equal");
        
      }
      
    }
  }