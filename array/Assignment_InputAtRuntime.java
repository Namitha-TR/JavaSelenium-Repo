package array;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_InputAtRuntime 
{

	public static void main(String[] args)
	{
		{
			Scanner s1=new Scanner(System.in);
			System.out.println("enter the length of array");
			int output=s1.nextInt();
				
				int[] num= new int[5];
				System.out.println("enter the elements of array");
				 for (int i=0; i<output; i++)
				 {
				 num[i]=s1.nextInt();
				 }
				 System.out.println(Arrays.toString(num));
			}

		}

	}


