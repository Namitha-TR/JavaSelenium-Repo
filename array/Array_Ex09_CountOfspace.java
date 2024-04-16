package array;

public class Array_Ex09_CountOfspace
{

	public static void main(String[] args)
	{
		int count_of_Space=0;
		boolean output;
		String name="Namitha 12 3";
		char[] a1=name.toCharArray();
		for(int i=0;i<name.length();i++)
		{
			output=Character.isSpaceChar(a1[i]);
			System.out.println(output);
			
			if(output==true)
			{
				count_of_Space++;
			}
		}
		System.out.println("The number of space is-> "+ count_of_Space  );
	}
	
	}


