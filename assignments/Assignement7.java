package assignments;

import java.util.Scanner;

public class Assignement7
{
	
	public static void main(String[] args) 
	{
	
		Scanner s1=new Scanner(System.in);
		int a=s1.nextInt();
		int b=s1.nextInt();
		int sum= a+b;
		System.out.println(sum);
		
		Scanner s2=new Scanner(System.in);
		int c=s2.nextInt();
		int d=s2.nextInt();
		int sub= c-d;
		System.out.println(sub);
		
		Scanner s3=new Scanner(System.in);
		int e=s3.nextInt();
		int f=s3.nextInt();
		int Mul= e*f;
		System.out.println(Mul);
		
		Scanner s4=new Scanner(System.in);
		int g=s4.nextInt();
		int h=s4.nextInt();
		int Div= g/h;
		System.out.println(Div);
		
		Scanner s5=new Scanner(System.in);
		int i=s5.nextInt();
		int j=s5.nextInt();
		int Mod= i%j;
		System.out.println(Mod);
		
		s1.close();
		s2.close();
		s3.close();
		s4.close();
		s5.close();
	
	}
			
	}


