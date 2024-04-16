package array;

import java.util.Arrays;

public class Array_Ex12_Anagram
{

	public static void main(String[] args)
{

      String a1="horse";
      String a2="shore";
      char[] c1=a1.toCharArray();
      char[] c2=a2.toCharArray();
      System.out.println(Arrays.toString(c1));
      System.out.println(Arrays.toString(c2));
      Arrays.sort(c1);
      Arrays.sort(c2);
      System.out.println(Arrays.toString(c1));
      System.out.println(Arrays.toString(c2));
      boolean output=Arrays.equals(c1, c2);
      if(output==true)
      {
    	  System.out.println("They are Anagram");
      }
      else
      {
    	  System.out.println("They are not Anagram"); 
      }
      System.out.println(output);
}

}
