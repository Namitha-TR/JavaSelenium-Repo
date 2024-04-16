package practicalpackage;

import java.util.Scanner;

public class ScannerClass_Ex2 {

	public static void main(String[] args) 
	{
		Scanner S1=new Scanner(System.in);
		String name=S1.next();
		byte b1=S1.nextByte();
		short b2=S1.nextShort();
		int b3=S1.nextInt();
		long b4=S1.nextLong();
		float b5=S1.nextFloat();
		double b6=S1.nextDouble();
		boolean b7=S1.nextBoolean();
		System.out.println(name);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
		System.out.println(b6);
		System.out.println(b7);
		S1.close();
		
				}

}
