package practicalpackage;

abstract class AClass_Ex2 
{
	void add() //concrete method1
	{
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	static void sub()//concrete method2
	{
		System.out.println(Math.subtractExact(10,20));
	}
	abstract void mul();//abstract method1
	abstract void div();//abstract method2
}
public class Abstarct_Class extends AClass_Ex2
{
	void modulus()
	{
		
	}
	
	public static void main(String[] args)
	{
		
		Abstarct_Class a1= new Abstarct_Class();
		a1.add();
		sub();
		a1.modulus();
		a1.mul();
		a1.div();
		
	}

	
	void mul()
	{

     System.out.println("Mul");
		
	}

	void div() 
	{
		System.out.println("Div");
		
	}

}
