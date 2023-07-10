/*WAP to input marks of five subjects Physics, Chemistry, Biology,     Mathematics and Computer. Calculate percentage and grade according to     following:
    Percentage >= 90% : Grade A
    Percentage >= 80% : Grade B
    Percentage >= 70% : Grade C
    Percentage >= 60% : Grade D
    Percentage >= 40% : Grade E
    Percentage < 40% : Grade F*/
import java.util.Scanner;
class GradeMarks
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter m1");
      int phy = sc.nextInt();
      System.out.println("enter m2");
      int chem = sc.nextInt();
      System.out.println("enter m3");
      int bio = sc.nextInt();
      System.out.println("enter m4");
      int math = sc.nextInt();
      System.out.println("enter m5");
      int comp = sc.nextInt();
      
      double sum=(phy+chem+bio+math+comp);

    double newpercentage= ((sum/500)*100);

      int percentage = (int) newpercentage;

      
      if(percentage>=90 )
      {
        System.out.println("you got A grade");
      }
      else if(percentage>=80 )
      {
        System.out.println("you got B grade");
      }
      else if(percentage>=70)
      {
        System.out.println("you got c grade");
      }
      else if(percentage>=60)
      {
        System.out.println("you got D grade");
      }
      else if(percentage>=40)
      {
        System.out.println("you got E grade");
      }
      else 
      {
        System.out.println("you got F grade");
      }
    }
  }
      
      