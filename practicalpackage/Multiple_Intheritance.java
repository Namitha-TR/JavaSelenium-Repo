package practicalpackage;
interface Parent1
{
	void login();
	void reg();
}
interface Parent2
{
	void reg1();
	void logout();
}


public class Multiple_Intheritance implements Parent1,Parent2
{

	public static void main(String[] args) 
	{
		Multiple_Intheritance m1= new Multiple_Intheritance();
				m1.reg1();
				m1.logout();
				m1.login();
				m1.reg();
	}

	
	public void reg1()
	{
		System.out.println("reg1");
		
	}

	
	public void logout()
	{
		System.out.println("Logout");
	}

	
	public void login()
	{
		System.out.println("login");
	}

	
	public void reg()
	{
		System.out.println("reg");
	}

}
