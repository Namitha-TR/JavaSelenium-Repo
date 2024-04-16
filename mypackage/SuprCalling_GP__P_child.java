package mypackage;

public class SuprCalling_GP__P_child 
{
	
	SuprCalling_GP__P_child()
	{
		System.out.println("3");
	}
}
class ParentClass extends SuprCalling_GP__P_child 
{
	ParentClass()
	{
		System.out.println("2");
	}
}
class ChildClass extends ParentClass
{
	ChildClass()
	{
		System.out.println("1");
	}
	public class MyClass
	{
		
	}
	public static void main(String[] args)
	{
	ChildClass c1=new ChildClass();
	}

}
