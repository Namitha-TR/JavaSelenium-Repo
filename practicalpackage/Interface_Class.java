package practicalpackage;
interface credentials
{
	void login();
	void regestration();
}

public class Interface_Class implements credentials
{
static void methodname()
{
	System.out.println("MethodName");
}
	public static void main(String[] args) 
	{
		methodname();
		Interface_Class i1=new Interface_Class();
		i1.login();
		i1.regestration();
	}
	
	public void login()
	{
		
		System.out.println("login");
	}
	
	public void regestration()
	{
		
		System.out.println("Regestration");
	}

}
