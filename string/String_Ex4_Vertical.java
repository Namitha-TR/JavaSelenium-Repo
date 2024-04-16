package string;

public class String_Ex4_Vertical 
{
	static void printfromreverse()
	{
	String name="Namitha TR";
	
	for(int i=name.length()-1;i>=0;i--) 
	{
		
		char c1= name.charAt(i);
		
			System.out.println(c1);
		}
	}
	public static void main(String[] args) 
	{
		
			printfromreverse();
			System.out.println("=============");
			String name= "Namitha TR";
			for(int i=0;i<name.length();i++)
			{
	           
				char c1= name.charAt(i);
				System.out.println(c1);
			}
	}
	}


	