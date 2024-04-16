package mypackage;

public class Supercalling {
	
	class Parent1
	{
	Parent1()
	{
		System.out.println("Thi is parent class");
	}
	public class non_parasupercalling extends Parent1
	{
		non_parasupercalling()
		{
		
			System.out.println("This is child constructor");
		}
	}

	public static void main(String[] args) 
	{
		non_parasupercalling n1= new non_parasupercalling();
			

	}
	}
}


