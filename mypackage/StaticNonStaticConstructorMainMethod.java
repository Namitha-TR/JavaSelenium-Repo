package mypackage;

public class StaticNonStaticConstructorMainMethod
{
	public static void add()//static
	{
		System.out.println("add");
	}
	public  void Sub()//non static
	{
		System.out.println("Sub");
	}
	public StaticNonStaticConstructorMainMethod() //constructor
	{
		System.out.println("mul");
	}
	
	public static void main(String[] args) 
	{
		add();
		StaticNonStaticConstructorMainMethod s1 = new StaticNonStaticConstructorMainMethod();
		s1.Sub();
		

	}

}
