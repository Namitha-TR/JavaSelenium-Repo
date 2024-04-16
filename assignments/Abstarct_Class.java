package assignments;

abstract class Assignment16
{
	void add() //concrete method1
	{
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	
	
	abstract void mul();//abstract method1
	abstract void div();//abstract method2
}
abstract class Assignment16b
{
	void sub() //concrete method1
	{
		int a=10;
		int b=20;
		System.out.println(a-b);
	}
	
	
	abstract void mul();//abstract method1
	abstract void div();//abstract method2
}
public class Abstarct_Class extends Assignment16 
{
	void modulus()
	{
		
	}
	void div1()
	{
		
	}
	
	
public static void main(String[] args) 
{
	Abstarct_Class a1= new Abstarct_Class();
	a1.add();
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

