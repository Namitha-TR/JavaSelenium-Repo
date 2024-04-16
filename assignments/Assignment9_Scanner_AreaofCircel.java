package assignments;

import java.util.Scanner;

public class Assignment9_Scanner_AreaofCircel 

{
    static double pi1=4;
   
    
	public static void main(String[] args) 
	{
Scanner s1=new Scanner(System.in);
final double pi=3.14;
int r=s1.nextInt();
double area=(pi*r*r);
System.out.println("Area of circel:"+area);

double r1=s1.nextDouble();
double area1=(pi1*r1*r1);
System.out.println("Area of circel1:"+area1);
s1.close();

	}

}
