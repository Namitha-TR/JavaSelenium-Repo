import java.util.Scanner;

public class Assignment13_AreaOfCircelWith10timeHumanInput 
{
	
	public static void main(String[] args)
	{
		for(int i=1;i<=10;i++)
		{
		Scanner s1=new Scanner(System.in);
		double pi=3.14;
		
		System.out.println("Enter the value of r:");
		int r=s1.nextInt();
		
		
		double area=(pi*r*r);
		System.out.println("Area of circel:"+area);
	
		}
		

	}

}
