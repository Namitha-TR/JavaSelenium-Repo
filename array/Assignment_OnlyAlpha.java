package array;

import java.util.Arrays;

public class Assignment_OnlyAlpha
{

	public static void main(String[] args) 
	
	{
		{
			int count_of_alpha=0;
			boolean output;
			String name="Namitha123";
			char[] value=name.toCharArray();
			
			System.out.println(Arrays.toString(value));
			System.out.println(name.length());
			
			for(int i=0;i<name.length();i++)
			{
				output=Character.isAlphabetic(value[i]);
				System.out.println(output);
				
				if(output==true)
				{
					count_of_alpha++;
				}
			}
			System.out.println("The number of alpha is-> "+ count_of_alpha  );
			
			if(name.length()==count_of_alpha)
			{
				System.out.println("Yes the given string consists only alpha" );
			}
				else
				{
					System.out.println("No the given string does not consists only alpha" );
					
			    }
		}
	}

}


