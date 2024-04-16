package exception_handling;

public class ExceptionHandling_Ex1 
{

	public static void main(String[] args) 
	{
       
       try
       {
	         int c=1/0;
	         System.out.println(c);
       }
       catch(ArithmeticException c) 
	{
    	 System.out.println("Exception is Handled");  
	}
	
  }

}
