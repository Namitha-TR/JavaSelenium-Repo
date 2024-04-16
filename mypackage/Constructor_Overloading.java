package mypackage;

public class Constructor_Overloading 
{
	Constructor_Overloading(int a, int b)
		{
			System.out.println("1");
		}
    Constructor_Overloading(double a)
		{
			System.out.println("2");
		}
    Constructor_Overloading()
		{
			System.out.println("3");
		}
		public static void main(String[] args)
		
		{
			new Constructor_Overloading(1,2);
			new Constructor_Overloading(65.45);
			new Constructor_Overloading();
		}
		
			
		}

			


		


