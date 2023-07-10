import java.util.Scanner;

public class Swap
  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the values x and y:");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

       x=x+y;
       y=x-y;
       x=x-y;
      
      
      System.out.println("after swapping "+x+" "+y);
    }
}
