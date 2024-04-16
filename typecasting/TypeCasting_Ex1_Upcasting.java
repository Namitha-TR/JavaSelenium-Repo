package typecasting;

class dataprovider
{
	void Username() 
	{
		
	}
	void Password() 
	{
		
	}
}

public class TypeCasting_Ex1_Upcasting extends dataprovider
{
	void login()
	{
		
	}



	public static void main(String[] args) 
	{
		dataprovider d1= new TypeCasting_Ex1_Upcasting();//upcasting
		d1.Username();
		d1.Password();
		System.out.println("Username");
		System.out.println("Password");
		 
		TypeCasting_Ex1_Upcasting d2=(TypeCasting_Ex1_Upcasting) d1;//downcasting
		d2.Username();
		d2.Password();
		d2.login();
		
		System.out.println("Username1");
		System.out.println("Password2");
		
		
	}

}
