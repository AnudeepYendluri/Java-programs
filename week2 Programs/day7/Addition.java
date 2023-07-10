import java.util.Scanner;

class Addition
  {
    public static void main(String args[])
    {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter a value");
      int a = scan.nextInt();
      System.out.println("Enter b value");
      int b = scan.nextInt();

      int c= a+b;

      System.out.println("addition is"+c);

      
    }
  }
