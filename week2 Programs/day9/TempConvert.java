/*Temperature Converter: Create an application that takes a temperature in Celsius or Fahrenheit as input and converts it to the other unit. Use conditional statements to determine whether to convert from Celsius to Fahrenheit or vice versa
    Fahrenheit or vice versa.
1 Celsius =  33.8 Fahrenheit
1 Fahrenheit =  -17.2222 Celsius
Formula to convert Celsius to Fahrenheit.
Fahrenheit = Celsius*1.8+32
Formula to convert Fahrenheit to Celsius.
Celsius = 5/9 * (Fahrenheit-32)*/
  import java.util.Scanner;
 class TempConvert
  {
    public static void main(String args [])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter c or f to convert");
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



