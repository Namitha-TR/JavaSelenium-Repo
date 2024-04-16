package string;

public class String_Ex1 
{

	public static void main(String[] args) 
	{
       String name="Namitha";
       int size =name.length();
       System.out.println(size);
       System.out.println(name.toUpperCase());
       System.out.println(name.toLowerCase());
       System.out.println(name.indexOf('t'));
       System.out.println(name.charAt(6));
       System.out.println(name.equals("Namitha"));//equals function
       System.out.println(name.equals("NamitHA"));
	}

}
