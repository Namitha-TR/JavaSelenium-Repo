package assignments;
class supergrandparnets2
{
	static void one()
	{
		System.out.println("one");
	}
}
class supergrandparnets1 extends supergrandparnets2
{
	static void two()
	{
		System.out.println("two");
	}
}
class supergrandparnets extends supergrandparnets1
	{
		static void three()
		{
			System.out.println("three");
		}
	}
class parent extends supergrandparnets
		{
			static void four()
			{
				System.out.println("four");
			}
		}
public class Assignment14_5ClassesMultilevelInheritance extends parent
{
	static void five()
	{
		System.out.println("five");
	}
	public static void main(String[] args)
	{
		one();
        two();
        three();
        four();
        five();
        

	}

}
