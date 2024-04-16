package practicalpackage;

  abstract class Googlecode 
  
{
	abstract void login();
	abstract void regestration();
}
	
public class Abstract_Class extends Googlecode
{
	 public static void main(String[] args) 
	{
		 Abstract_Class a1=new Abstract_Class();
		a1.login();
		 a1.regestration();
	}

	
	void login() 
	{
		System.out.println("Login");
	}

	
	void regestration() 
	{
		System.out.println("Regestration");
		
	}
}



