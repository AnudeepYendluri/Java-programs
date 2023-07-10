/*WAP to input any character and check whether it is alphabet, digit    or special character.*/
import java.util.Scanner;
class CharDigitSpec
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the key");
      char ch = sc.next().charAt(0);
     
     if((ch>='a'&& ch<='z')||(ch>='A'&& ch<='Z'))
     {
       System.out.println(ch+" is a charecter");
     }
    else if (ch>='0'&& ch<='9')
    {
     System.out.println(ch+" is a digit"); 
    }
    else
    {
      System.out.println(ch+" is a Special charecter");
    }
    
    
    
    }

    
  }