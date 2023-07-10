class TruthTable
  {
    public static void main(String args[])
    {
      boolean a = true;
      boolean b = false;

      //And operator
      System.out.println(a && b);
      System.out.println(b && a);
      System.out.println(b && b);
      System.out.println(a && a);
      
      //or operator
      System.out.println(a || b);
      System.out.println(b || a);
      System.out.println(b || b);
      System.out.println(a || a);
      
    }
  }