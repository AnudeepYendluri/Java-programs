//WAP to check whether a character is alphabet or not.
import java.util.Scanner;
class AlphabetOrNot
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a character ");
      char ch=sc.next().charAt(0);
      

      if((ch>='a'&& ch<='z')||(ch>='A'&& ch<='Z'))
      {
        System.out.println(ch + " is a alphabet");
      }
      else
      {
        System.out.println(ch + " is a not an alphabet");
      }
      
    }
  }
