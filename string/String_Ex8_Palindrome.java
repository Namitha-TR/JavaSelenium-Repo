package string;

public class String_Ex8_Palindrome 
{

	public static void main(String[] args) 
	{
      String input= "radar";
      String output="";
      for(int i=input.length()-1;i>=0;i--)
   {
	char rev=input.charAt(i);
	System.out.println(rev);
	output=output+rev;
   }
      System.out.println(output);
      
      if(input.equals(output))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
      }
      
	}


