/*Employee Salary Calculator: Create an application that takes an employee's salary and calculates their annual salary, tax and net salary. Use conditional statements to determine the tax bracket and calculate the tax accordingly.*/
import java.util.Scanner;
class FinalSalary
{
  public static void main(String args[])
  {
    Scanner sc =new Scanner(System.in);
    System.out.println("enter the salary");
    double salary=sc.nextDouble();

    double ann_sal= salary*12;
    System.out.println("Annual salary is "+ ann_sal);

     if (ann_sal<300000)
    {
      double net_sal = ann_sal;
      System.out.println("net salary is "+net_sal);
    }
    else if (ann_sal>=300000 && ann_sal<=600000)
    {
      double tax=((ann_sal*5)/100);
      double net_sal= (ann_sal-tax);
      System.out.println("net salary is "+net_sal);
    }
    else if (ann_sal>600000 && ann_sal<=900000)
    {
      double tax=((ann_sal*10)/100);
      double net_sal= (ann_sal-tax);
      System.out.println("net salary is "+net_sal);
    }
    else if (ann_sal>900000 && ann_sal<=1200000)
    {
      double tax=((ann_sal*15)/100);
      double net_sal= (ann_sal-tax);
      System.out.println("net salary is "+net_sal);
    }
    else if (ann_sal>1200000 && ann_sal<=1500000)
    {
      double tax=((ann_sal*20)/100);
      double net_sal= (ann_sal-tax);
      System.out.println("net salary is "+net_sal);
    }
    else 
    {
      double tax=((ann_sal*30)/100);
      double net_sal= (ann_sal-tax);
      System.out.println("net salary is "+net_sal);
    }
  }
}