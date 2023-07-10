/*Age Calculator  :  Create an application that takes a person's birthdate as input and calculates their current age. Use conditional statements to determine if they are a minor or an adult.*/
import java.util.Scanner;
class AgeCalculator
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the day");
      int day=sc.nextInt();

      System.out.println("Enter the month");
      int mon=sc.nextInt();

      System.out.println("Enter the year");
      int year=sc.nextInt();

      System.out.println("Enter the present year");
      int present_year=sc.nextInt();
      

      int age= present_year-year;

      if (age<18)
      {
        System.out.println("you are a minor");
      
      }
      else {
        System.out.println("you are an adult");
          }   
      
    }
  }