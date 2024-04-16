package array;

public class Array_Ex4_ArraytoString_name
{

	public static void main(String[] args) 
	{
		int count_of_alpha=0;
		boolean output;
		String name="Namitha123";
		char[] a1=name.toCharArray();
		
	
		for(int i=0;i<name.length();i++)
		{
			output=Character.isAlphabetic(a1[i]);
			System.out.println(output);
			
			
			if(output==true)
			{
				count_of_alpha++;
			}
		}
		System.out.println("The number of alpha is-> "+ count_of_alpha  );
		}
	
			
		
	}


