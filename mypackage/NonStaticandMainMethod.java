package mypackage;

public class NonStaticandMainMethod 
{
	void add()
	{
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	

	public static void main(String[] args) 
	{
		NonStaticandMainMethod n1=new NonStaticandMainMethod() ;
		n1.add();


	}

}
