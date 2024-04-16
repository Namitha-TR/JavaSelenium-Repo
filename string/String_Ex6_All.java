package string;

import java.util.Date;

public class String_Ex6_All 
{

	public static void main(String[] args)
	{
		Date d1=new Date();
		d1.getTime();//will return long because it will return epoch value
		//d1.getDate();//depreciated methods
		
		Date d2=new Date(d1.getTime());
		System.out.println(d2);
		String currentTime=d2.toString();
		System.out.println(currentTime);
		Date futuretime=new Date(d1.getTime()+(1000*60*60*24*1));
		System.out.println(futuretime);
		String Month= currentTime.substring(4,7);
		System.out.println(Month);
		String date= currentTime.substring(8,10);
		System.out.println(date);
		String year= currentTime.substring(24);
		System.out.println(year);
		System.out.println();
		System.out.println(Month.concat(date).concat(" ").concat(year));
		System.out.println(Month.concat("/").concat(date).concat("/").concat(year));

		
		}
	

}
