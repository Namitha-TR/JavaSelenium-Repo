package assignments;

import java.util.Scanner;

public class Assignemnt10_CircumferenceOfCircle 
{
     static double pi1=3.14;

	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		int r=s1.nextInt();
		final double pi=s1.nextDouble();
		double cc=(2*pi*r);
		double cc2=(2*pi1*r);
		
		System.out.println("CircumferenceofCircle=" +cc);
		System.out.println("CircumferenceofCircle1=" +cc2);
		s1.close();
		
	}

}
