package practicalpackage;
interface Grandparent
{
	void Method1();//AM1
	void Method2();//AM2
}
abstract class parent implements Grandparent

{
	
	abstract void method3();//AM1
	abstract void method4();//AM2
	
	static void add()//CM1
	{
		System.out.println("add");
	}
}
public class child_InteracePgm extends parent
{ 
	static void sub()//CM1
	{
		System.out.println("sub");
	}
	public void Method1() 

	{
		System.out.println("Method1");
	}
    public void Method2() 
	{
    	System.out.println("Method2");
	}
    void method3() 
	{
    	System.out.println("Method3");
	}
    void method4() 
	{
    	System.out.println("Method4");
	}

public static void main( String[] args) 
    
  {
	child_InteracePgm c1 = new child_InteracePgm();
           add();
           c1.Method1();
           c1.Method2();
           c1.method3();
           c1.method4();
           
  }
}









	

      
	








