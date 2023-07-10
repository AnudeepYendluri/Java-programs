import java.util.Scanner;

public class Circumference
  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius:");
        int radius = scanner.nextInt();
         int pie=3;
      int c= 2*pie*radius;
      
      System.out.println("circumference of the circle is "+c);
    }
}
