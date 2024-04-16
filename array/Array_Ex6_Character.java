package array;

import java.util.Arrays;

public class Array_Ex6_Character 
{

	public static void main(String[] args)
	{
		boolean output;
		String name="Namitha1";
		char[] a1=name.toCharArray();
		System.out.println(Arrays.toString(a1));
		//boolean output=Character.isDigit(a1[0]);
		//System.out.println(output);
		
		for(int i=0;i<name.length();i++)
		{
			output=Character.isDigit(a1[i]);
			System.out.println(output);
			if(output==true)
			{
				System.out.println("Numeric is present at index= "+ i);
			}
		}
	}

}
