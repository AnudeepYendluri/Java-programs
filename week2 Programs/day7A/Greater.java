/* Write a program that takes an input number from the user and prints whether it is greater than 10.*/
/*Write a program that takes an input number from the user and prints whether it is even or odd.*/

import java.util.Scanner;
class Greater
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number ");
      int number = sc.nextInt();

      if(number>10)
      {
        System.out.println("The given number is Greater than 10");
      }
      else{
        System.out.println("The given number is not greater than 10");
      }
      
    }
  }
