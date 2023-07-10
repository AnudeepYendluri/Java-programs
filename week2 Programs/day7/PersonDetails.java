import java.util.Scanner;

class PersonDetails
  {
    public static void main(String args[])
    {
      Scanner scan = new Scanner(System.in);
      System.out.println(" Enter name");
      String name = scan.nextLine();
      System.out.println(" Enter marks");
      int marks = scan.nextInt();
      System.out.println(" Enter mobileno");
      long mobileno= scan.nextLong();
      System.out.println(" Enter martial_status");
      boolean martial_status = scan.nextBoolean();
      System.out.println(" Enter percentage");
      double percentage = scan.nextDouble();
      System.out.println(" Enter grade");
      char grade = scan.next().charAt(0);


      System.out.println("my name is "+name);
      System.out.println("my marks is "+marks);
      System.out.println("my mobileno is "+mobileno);
      System.out.println("my martial_status is "+martial_status);
      System.out.println("my percentage is "+percentage);
      System.out.println("my grade is "+grade);

      
      
      
      
      
    }
  }