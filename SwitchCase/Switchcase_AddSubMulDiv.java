package SwitchCase;

public class Switchcase_AddSubMulDiv 
{

	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		int Add= a+b;
		int Sub= a-b;
		int Mul= a*b;
		int Div= a/b;
		
		switch(1)
		{
	case 1:
		System.out.println(Add);
	case 2:
		System.out.println(Sub);
		
	case 3:
		System.out.println(Mul);
		
	case 4:
		System.out.println(Div);
	
	default:
	{
		System.out.println("AddSubMulDiv");
	}
	}

	}

}
