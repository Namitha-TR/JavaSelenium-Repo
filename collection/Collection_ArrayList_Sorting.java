package collection;

import java.util.ArrayList;
import java.util.Collections;

public class Collection_ArrayList_Sorting 
{

	public static void main(String[] args)
	{
		ArrayList a1=new ArrayList();
		a1.add(1);
		a1.add(5);
		a1.add(2);
		a1.add(4);
		a1.add(3);
		Collections.sort(a1);
		System.out.println(a1);
		
	}

}
