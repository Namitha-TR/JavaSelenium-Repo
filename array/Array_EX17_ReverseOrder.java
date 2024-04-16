package array;

import java.util.Arrays;

public class Array_EX17_ReverseOrder 
{

	public static void main(String[] args)
	{
		int Number[]=new int[4];
		int num[]=new int[4];
		int k=num.length-1;
		Number[0]=1;
		Number[1]=2;
		Number[2]=3;
		Number[3]=4;
		for(int i=0;i<Number.length;i++)
		{
			num[k]=Number[i];
			k--;
			
		}
		
          System.out.println("The Given number is"+ Arrays.toString(Number));
          System.out.println("The Reverse number is"+ Arrays.toString(num));


	}

}
