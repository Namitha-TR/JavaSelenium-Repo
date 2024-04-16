package mypackage;

public class ManyIfinOnemethod {

	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		int c=30;
		if(a>b) 
		{
			System.out.println("1");
		}
		if(b>c) 
		{
			System.out.println("2");
		}
		if(a<b) 
		{
			System.out.println("3");
		}
		if(b>c) 
		{
			System.out.println("4");
		}
		if(a<=b) 
		{
			System.out.println("5");
		}
		if(b>=c) 
		{
			System.out.println("6");
			
		}
		if(a==b) 
		{
			System.out.println("7");
		
		}
		if(c!=b) 
		{
			System.out.println("8");
		}

	}

}
