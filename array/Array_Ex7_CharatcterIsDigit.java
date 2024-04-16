package array;

public class Array_Ex7_CharatcterIsDigit 
{

	public static void main(String[] args) 
	{
		int count_of_numeric=0;
		boolean output;
		String name="Namitha123";
		char[] a1=name.toCharArray();
		for(int i=0;i<name.length();i++)
		{
			output=Character.isDigit(a1[i]);
			System.out.println(output);
			
			if(output==true)
			{
				count_of_numeric++;
			}
		}
		System.out.println("The number of numeric in-> "+ count_of_numeric  );
	}

}
