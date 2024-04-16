package practicalpackage;

public class Globalvariable_ex2 
{
	static int a=10;//global variable

	public static void main(String[] args)
{	
		a=30;//updated the global variable
		System.out.println(a);//since a is is common need to print frst globally then locally
         int a=20;//local variable
		System.out.println(a);

	}

}
