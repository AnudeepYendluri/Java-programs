class GreatestNumber
  {
    public static void main(String args[])
    {
      int a=20,b=10,c=30;
      
       int max= (a>b && a>c)? a :(b>c? b : c);
       System.out.println("greatest values is "+ max);
    }
  } 