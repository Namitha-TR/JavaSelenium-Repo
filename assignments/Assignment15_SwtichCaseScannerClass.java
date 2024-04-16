package assignments;

import java.util.Scanner;

public class Assignment15_SwtichCaseScannerClass {

	public static void main(String[] args) 
	{

		Scanner s1=new Scanner(System.in);
		System.out.println("enter the value of a");
		int a=s1.nextInt();
		
		System.out.println("enter the value of b");
		int b=s1.nextInt();
		
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
		break;
	
	default:
	{
		System.out.println("AddSubMulDiv");
	}
	
   }
}
}
	
	


