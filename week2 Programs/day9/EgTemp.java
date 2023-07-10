 import java.util.Scanner;
 class EgTemp
  {
    public static void main(String args [])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter c or f in which you want to convert");
      char ch=sc.next().charAt(0);
    
    if (ch=='c'|| ch=='C')
    {
      System.out.println("enter the Fahrenheit value");
      double fahrenheit = sc.nextDouble();
      double celsius = (fahrenheit-32)*5/9;
      System.out.println("converted fahrenheit to celcius "+ celsius);
    }
    else if (ch=='f'|| ch=='F')
    {
      System.out.println("enter the Celcius  value");
      double celsius =sc.nextDouble();
      double fahrenheit = (celsius*1.8+32);
      System.out.println("converted celsius to fahrenheit"+ fahrenheit);
      
    }
    else  

    {
      System.out.println("invalid");
    }
    }
  }

