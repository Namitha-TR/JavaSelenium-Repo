
package assignments;

public class FiveConstructors 
{
	FiveConstructors(int a)
	{
	System.out.println("1");
	}
	FiveConstructors(char a)
	{
	System.out.println("2");
	}
	FiveConstructors(String a)
	{
	System.out.println("3");
	}
	FiveConstructors(boolean a)
	{
	System.out.println("4");
    }
	FiveConstructors(int a,boolean b)
	{
	System.out.println("5");
	}
public static void main(String[] args) 
	{
		 new FiveConstructors(1);
		 new FiveConstructors('A');
		 new FiveConstructors("name");
		 new FiveConstructors(true);
		 new FiveConstructors(2,false);


	}

}
