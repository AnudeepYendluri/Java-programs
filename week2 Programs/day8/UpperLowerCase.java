/*WAP to check whether a character is uppercase or lowercase     alphabet*/
import java.util.Scanner;
class UpperLowerCase
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a character ");
      char ch=sc.next().charAt(0);
      

      if(ch>='a'&& ch<='z')
      {
        System.out.println(ch+"is a lower case");
      }
      else
      {
        System.out.println(ch + " is a uppercase");
      }
      
    }
  }
