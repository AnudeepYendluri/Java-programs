//to print sum of 1 to 50 even numbers
class For7
  {
    public static void main(String args[])
    {
      int sum=0;
      for (int i=1;i<=50;i++)
        {
         if(i%2==0)
         
           sum=sum+i; 
        }
       System.out.println(sum);
    
    }
  }