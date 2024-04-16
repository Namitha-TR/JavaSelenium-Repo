package string;

public class String_Ex5_contains_Substring 
{

	public static void main(String[] args) 
	{
		String name = "Manish Kumar Tiwari";
		boolean b1=name.contains("Manish");
		System.out.println(b1);
		String S1=name.substring(7);
		System.out.println(S1);
		String S2=name.substring(7,12);
		System.out.println(S2);
		
	}

}
