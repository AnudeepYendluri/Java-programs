/* Traffic Light Simulator: Create a simulation of traffic lights at a junction. Use conditional statements to change the lights based on the time of day and the traffic flow.*/
import java.util.Scanner;
class TrafficLight
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the Time");
      double time=sc.nextDouble();

      if (time>=1&&time<=6)
      {
        System.out.println("green");
      }
      else if (time>6&&time<=7)
      {
        System.out.println("yellow");
      }
      else if (time>7&&time<=10)
      {
        System.out.println("red");
      }
     else if (time>10&&time<=12)
      {
        System.out.println("green");
      }
      else if (time>12&&time<=14)
      {
        System.out.println("Yellow");
      }
      else if (time>14&&time<=16)
      {
        System.out.println("green");
      }
       else if (time>16&&time<=18)
      {
        System.out.println("red");
      }
      else if (time>=18&&time<=19)
      {
        System.out.println("green");
      }
      else if (time>19&&time<=21)
      {
        System.out.println("red");
      }
      else if (time>21&&time<=24)
      {
        System.out.println("green");
      }
      else 
      {
        System.out.println("invalid");
      }
    }
  }
      
