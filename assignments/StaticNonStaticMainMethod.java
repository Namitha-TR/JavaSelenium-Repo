package assignments;

public class StaticNonStaticMainMethod 
{
	static void add()
	{
		System.out.println("add");
		
	}
	static void Sub()
	{
		System.out.println("Sub");
		
	}
	static void Mul()
	{
		System.out.println("Mul");
		
	}
	static void Div()
	{
		System.out.println("Div");
		
	}
	void Add1()
	{
		System.out.println("Add1");
	}
	void Sub1()
	{
		System.out.println("Sub1");
	}
	void Mul1()
	{
		System.out.println("Mul1");
	}
	void Div1()
	{
		System.out.println("Div1");
	}

	public static void main(String[] args) 
	{
		add();
		Sub();
		Mul();
		Div();
		
		StaticNonStaticMainMethod S1=new StaticNonStaticMainMethod();
		S1.Add1();
		S1.Sub1();
		S1.Mul1();
		S1.Div1();

	}

}
