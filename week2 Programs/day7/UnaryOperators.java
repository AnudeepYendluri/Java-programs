class UnaryOperators
  {
    public static void main (String args[])
    {
      int x= 10;
      //x++; op 11
      //x--; op 9
      
      //int y=x++;
      //System.out.println(y); op y=10
      //System.out.println(x); op x=11

      //int y=--x;
      //System.out.println(y); op y=9
      //System.out.println(x); op x=9

      //int y=++x;
      //System.out.println(++y + x--); //12+11=23

      int y=--x;
      System.out.println(--x + ++y); //8+10=18

      

      

      
      
      
    }
  }