package mypackage;

public class GlobalVariable
{
        int z=100;//global variable and since it is non static we can access as like non static method
		static double pi=3.14;//global variable
		static char gender='F';//declared and intialized
		static boolean value1=true;//declared and intialized
		static int age;//default value
		void add()
		{
			int a=10;
			int b=20;
		}
		void sub()
		{
			int a=10;
			a=20;
			int b=20;
		}
		static void multi() 
		{
			System.out.println(pi);
		}
		public static void main(String[] args)
		{
			System.out.println(pi);
			System.out.println(value1);
			System.out.println(age);
			GlobalVariable g1=new GlobalVariable();
			g1.z=20;
			System.out.println(g1.z);
	}

}
