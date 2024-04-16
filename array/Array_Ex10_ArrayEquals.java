package array;

import java.util.Arrays;

public class Array_Ex10_ArrayEquals 
{

	public static void main(String[] args)
	{
      int num[]=new int[3];
      int num1[]=new int[3];
      num[0]=11;
      num[1]=11;
      num[2]=111;
      num1[0]=11;
      num1[1]=11;
      num1[2]=11;
      boolean output=Arrays.equals(num,num1);
    		  System.out.println(output);
      
      


	}

}
