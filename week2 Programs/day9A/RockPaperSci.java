/*1. Rock Paper Scissors Program :  Create a simple game of rock-paper-scissors where the user plays against the computer. Use conditional statements to determine the winner of each round.*/
import java.util.Scanner;
class RockPaperSci
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("user enter the char r or p or s ");
      char user=sc.next().charAt(0);
      System.out.println("computer enter char r or p or s ");
      char com =sc.next().charAt(0);

      if ((user=='r'||user=='R')&& (com=='p'||com=='P'))
      {
        System.out.println("The winner is com");
      }
      else if ((user=='p'||user=='P')&& (com=='r'||com=='R'))
      {
        System.out.println("The winner is user");
      }
      else if ((user=='r'||user=='R')&& (com=='s'||com=='S'))
      {
        System.out.println("The winner is user");
      }
      else if ((user=='s'||user=='S')&& (com=='r'||com=='R'))
      {
        System.out.println("The winner is com");
      }
      else if ((user=='s'||user=='S')&& (com=='p'||com=='P'))
      {
        System.out.println("The winner is user");
      }
      else if ((user=='p'||user=='P')&& (com=='s'||com=='S'))
      {
        System.out.println("The winner is com");
      }
      else
      {
        System.out.println("Invalid");
      }
    }
  }