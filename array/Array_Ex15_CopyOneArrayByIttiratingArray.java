package array;

import java.util.Arrays;

public class Array_Ex15_CopyOneArrayByIttiratingArray 
{

	public static void main(String[] args) 
	{
		int NUM[]=new int[4];
		int num[]=new int[4];
		num[0]=1;
		num[1]=2;
		num[2]=3;
		num[3]=4;
		for(int i=0;i<num.length;i++) 
		{
			NUM[i]=num[i];
		}
		System.out.println("First Array "+ Arrays.toString(num));
		System.out.println("Copied Array "+ Arrays.toString(NUM));
		
	}

}
