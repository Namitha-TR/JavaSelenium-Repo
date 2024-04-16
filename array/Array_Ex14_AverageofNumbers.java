package array;

public class Array_Ex14_AverageofNumbers
{

	public static void main(String[] args)
	{
		int num[]=new int[5];
		num[0]=1;
		num[1]=2;
		num[2]=3;
		num[3]=4;
		num[4]=5;
		int sum=0;
		for(int i=0;i<num.length;i++)
		{
		sum=sum+num[i];
		}
		System.out.println(sum);
		double average=sum/num.length;
		System.out.println(average);
	}

}
