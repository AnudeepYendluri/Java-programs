class LogicalOperators 
{
  public static void main(String args[])
  {
    int a=30;
    int b=50;
    int y=40;

    //And operator
    System.out.println(a<b && y==40);
    System.out.println(a<b && y==30);

    //Or operator
    System.out.println(a>b || y!=40);
    System.out.println(a<b || y==30);

    //Not operator
    System.out.println(!(a<b && y==40));
    
  }
}