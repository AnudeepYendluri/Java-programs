/*Write a program that takes an input number from the user and prints whether it is even or odd.*/

import java.util.Scanner;
class EvenOrOdd
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number ");
      int number = sc.nextInt();

      if(number%2==0)
      {
        System.out.println("The given number is Even");
      }
      else
      {
        System.out.println("The given number is odd");
      }
      
    }
  }
